package com.revature;

public class OverrideDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor = new Doctor();
		doctor.treatment();
		
		FamilyDoctor familyDoctor = new FamilyDoctor();
		familyDoctor.treatment();
	}

}

class Doctor {
	public void treatment() {
		System.out.println("Doctor is giving treatment");
	}
	
}

class FamilyDoctor extends Doctor {
	public void treatment() {
		System.out.println("Family doctor will visit home to give treatment");
		super.treatment();
	}
}
