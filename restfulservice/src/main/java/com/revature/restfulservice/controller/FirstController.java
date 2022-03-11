package com.revature.restfulservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.restfulservice.model.Customer;

@RestController
public class FirstController {
	private static List<Customer> customerList = new ArrayList<Customer>();

	public FirstController() {
//		List<Customer> customerList = new ArrayList<Customer>();
		customerList.add(new Customer(100, "ABC", "abc@gmail.com", 9878987898l));
		customerList.add(new Customer(101, "XYZ", "xyz@gmail.com", 9080907090l));
		customerList.add(new Customer(102, "MNO", "mno@gmail.com", 8903189371l));
		customerList.add(new Customer(103, "PQR", "pqr@gmail.com", 9944159844l));
		customerList.add(new Customer(104, "DEF", "def@gmail.com", 9878987898l));

	}

	@RequestMapping("/welcome")
	public String welcome() {
		return "Hi ALL!!!Welcome to Spring Boot";
	}

	// read operation
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}

	// insert/create operation
	@PostMapping("/hello")
	public String hello2() {
		return "Hello World!!!";
	}

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable int id) {
		Customer cust = null;
		for (Customer customer : customerList) {
			if (customer.getId() == id)
				cust = customer;
		}

		return cust;
	}

	@GetMapping("/customer")
	public List<Customer> getCustomers() {
		return customerList;
	}
}
