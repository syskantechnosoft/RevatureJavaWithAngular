package com.revature;

public class Car {
	private int yearOfMfg;
	private int noOfGears;
	private String engineType;
	private int speed;

//default constructor	
	public Car() {
		super();
	}

//Fully parameterised/all args constructor)
	public Car(int yearOfMfg, int noOfGears, String engineType, int speed) {
		super();
		this.yearOfMfg = yearOfMfg;
		this.noOfGears = noOfGears;
		this.engineType = engineType;
		this.speed = speed;
	}

	public int getYearOfMfg() {
		return yearOfMfg;
	}

	public void setYearOfMfg(int yearOfMfg) {
		this.yearOfMfg = yearOfMfg;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
