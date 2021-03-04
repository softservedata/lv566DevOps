package com.softserve.oop;

public class Appl {
	private int i = 1;

	public void m2() {
		System.out.println("m1 running");
		m1();
	}

	public static void m1() {
		System.out.println("m1 done");
	}

	public static void main(String[] args) {
		// System.out.println("i = " + i); // Compile Error
		m1();
		Appl appl = new Appl();
		appl.m2();
		System.out.println("appl.i = " + appl.i);
		//
		Appl appl2 = new Appl();
		appl2.i = 123;
		System.out.println("appl2.i = " + appl2.i);
		System.out.println("appl.i = " + appl.i);
		//
		System.out.println(appl.getClass());
		System.out.println(Appl.class);
	}

}
