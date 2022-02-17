package com.revature;

public class InheritanceDemo {

}

class A { //parent
	
}

class B extends A { //child
	
}

class C extends B { //grand child
	
}

interface A1 { }

interface B1 { }

interface C1 extends A1,B1 { }

class D extends A implements A1,B1 { }  //valid

//class D extend A,C { }  invalid
