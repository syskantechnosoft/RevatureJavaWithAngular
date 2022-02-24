package com.revature.project;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.project.entity.User;

public class LoginControllerTest {
	static User user;
	static LoginController object;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		user = new User(100, "admin", "admin123", "firstAdmin", "lastname", "admin@gmail.com", 7867875645l);
		object = new LoginController();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLogin() {
//		fail("Not yet implemented");
		assertTrue(object.login(user));
	}

}
