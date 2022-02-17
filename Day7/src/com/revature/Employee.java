package com.revature;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private transient String ssn;

	public Employee(int id, String name, String ssn) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
	}

	public Employee() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	

	// serializable interface is a marker interface - it won't have any method

}
