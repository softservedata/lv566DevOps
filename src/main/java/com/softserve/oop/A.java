package com.softserve.oop;

public class A { // by default extends Object
	private int i = 12;

//    public A() { // Default Constructor
//        System.out.println("constructor A()");
//    }

	public A(int i) {
		this.i = i;
		System.out.println("constructor A(int i)");
	}
	//
//    1. get memory
//    2. create object
//    3. set fields
//    4. setup table of virtual metods

	public static void my() {
		System.out.println("my()");
	}
	
	public int getI() {
		System.out.println("\tgetI() from A");
		return i;
	}

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}

}
