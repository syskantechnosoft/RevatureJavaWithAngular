package com.revature;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.revature.beans.User;
import com.revature.dao.UserDao;
import com.revature.exceptions.InvalidCredentialsException;
import com.revature.exceptions.UsernameAlreadyExistsException;
import com.revature.services.UserService;

public class UserTests extends PointWatcher {
	
	@InjectMocks
	public UserService userSrv;
	
	@Mock
	public UserDao udao;
	
	@Before
	public void setupMocks() {
		User mockUser = new User();
		mockUser.setUsername("testuser");
		mockUser.setPassword("testpassword");
		// DAO layer will only retrieve "testuser" -> simulating only this user existing in persistence layer
		when(udao.getUser(anyString(), anyString())).then(invocation -> {
			String uname = invocation.getArgument(0);
			String pw = invocation.getArgument(1);
			if (uname.equals("testuser") && pw.equals("testpassword")) {
				return mockUser;
			} else {
				return null;
			}
		});
	}
	
	/*
	 * This test uses mocking to test that the DAO layer is being called once to login
	 */
	@Test
	@Points(2)
	public void testLoginWithValidCredentials() {
		String username = "testuser";
		String pw = "testpassword";
		User user = userSrv.login(username, pw);
		assertNotNull(user);
		verify(udao, times(1)).getUser(username, pw);
	}
	
	/*
	 * This is an example of a negative test. Here, we want to ensure that we are properly
	 * rejecting invalid credentials and preventing unauthorized logins
	 */
	@Test(expected=InvalidCredentialsException.class)
	@Points(1)
	public void testLoginWithInvalidCredentials() {
		String username = "wrong";
		String pw = "credentials";
		userSrv.login(username, pw);
	}
	
	@Test
	@Points(1)
	public void testRegistration() {
		String uname = "registrationTester";
		String pw = "abcdef";
		User newUser = new User();
		newUser.setUsername(uname);
		newUser.setPassword(pw);
		userSrv.register(newUser);
		verify(udao, times(1)).addUser(newUser);
	}
	
	@Test(expected=UsernameAlreadyExistsException.class)
	@Points(1)
	public void testInvalidRegistration() {
		// try registration with same username - this should fail
		User anotherUser = new User();
		anotherUser.setUsername("testuser");
		anotherUser.setPassword("testpassword");
		userSrv.register(anotherUser);
	}
	
}
