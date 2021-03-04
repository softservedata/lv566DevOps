package com.softserve.oop;

public class AppAB {

	public static void main(String[] args) {
		/*-
		A a = new A();
		System.out.println("a = " + a); // by default .toString();
		*/
		//
		B b =new B();
		System.out.println("b = " + b); // toString()
		System.out.println("b.i = " + b.getI());
		// b.my();
		// A.my();
		B.my();
	}
}
