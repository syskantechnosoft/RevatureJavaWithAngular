package com.revature.p1.myp1.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p1.myp1.model.User;
import com.revature.p1.myp1.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/users")
	public List<User> getUsers() {
//		List<User> users = new ArrayList<User>();
//		users.add(new User(100, "abc", "abc1234", "abc@gmail.com", 8978675667l));
//		users.add(new User(101, "xyz", "xyz1234", "xyz@gmail.com", 8989098990l));
//		users.add(new User(102, "mno", "mno1234", "mno@gmail.com", 9989780907l));
//		users.add(new User(103, "pqr", "pqr1234", "pqr@gmail.com", 8912232123l));
		return userService.findAll();
	}

	@GetMapping("/users/{id}")
	public User getUser(@PathVariable int id) {
		return userService.findById(id);
	}

	@PostMapping("/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@PutMapping("/users/{id}")
	public void updateUser(@PathVariable int id, @RequestBody User user) {
		userService.updateUser(id, user);
	}

	@DeleteMapping("/users/{id}")
	public void removeUser(@PathVariable int id) {
		userService.removeUser(id);
	}

}
