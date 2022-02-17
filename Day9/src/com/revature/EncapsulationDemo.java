package com.revature;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureData object = new SecureData();
		System.out.println(object);
		
		
		object = new SecureData(100, "ABC", "abc@gmail.com", 9878675645L);
		System.out.println(object);

		object.setId(120);
		object.setEmail("xyz@gmail.com");
		object.setMobile(8767785634L);
		object.setName("xyz");

		System.out.println(object.getName() + " is having an id =" + object.getId() + " whose email address is ="
				+ object.getEmail() + " and mobile number is " + object.getMobile());
	}

}

class SecureData {
	private int id; // private member
	String name; // package/default member
	protected String email; // protected member
	public long mobile; // public member

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	// fully parameterized or all-args constructor
	public SecureData(int id, String name, String email, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	// partially parameterized constructor
	public SecureData(String name, String email, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public SecureData(int id, String email, long mobile) {
		super();
		this.id = id;
		this.email = email;
		this.mobile = mobile;
	}

	public SecureData(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

//	public SecureData(int id, String name, long mobile) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.mobile = mobile;
//	}

	// default / no-arg constructor
	public SecureData() {
		super();
	}

	@Override
	public String toString() {
		return "SecureData [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + "]";
	}

}