package com.revature;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base obj1 = new Base();
		Sub2 obj2 = new Sub2();
		
		obj1.show();
		obj2.show();
		
		Base obj3 = new Sub2();
		obj3.show();
	}

}

class Base {
	public void show () {
		System.out.println("This is Base class show method");
	}
}
class Sub2 extends Base {
	@Override
	public void show () {
		super.show();
		System.out.println("This is Sub class show method");
	}
}
