package com.revature.p1.myp1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p1.myp1.model.User;
import com.revature.p1.myp1.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void updateUser(int id, User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}

}
