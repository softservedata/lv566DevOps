package com.softserve.inheritance;

public class Appl {
	public static void main(String[] args) {
		System.out.println("The Start.");
		//
		/*-
		System.out.println("Test ClassA.");
		ClassA a;
		a = new ClassA();
		System.out.println("a.i = " + a.i);
		a.m1();
		a.m2();
		a.m3();
		a.m4();
		a.m6();  // must be A.m6();
		a.m7();
		a.m8(); // error from other package
		*/
		// /*-
		System.out.println("Test ClassB.");
		ClassA b; // = null;
		// System.out.println("b.i = " + b.i); // error not init
		b = new ClassB(); // 1 polimorphism (compile)
		System.out.println("b.i = " + b.i); // from A, fields not virtual; Architecture Error; Fields must be private
		b.m1(); // 2 polimorphism (runtime), m1() running from object, not ClassA
		b.m2(); // i get from ClassA; fields not virtual
		b.m3(); // 3 polimorphism (runtime)
		b.m4();
		//b.m5(); // Compile ERROR
		//((ClassB) b).m5(); // Code Smell
//		if (b instanceof ClassB) {
//			((ClassB) b).m5(); // No Runtime Error
//		}
		b.m6(); // Running from ClassA; invalide solution
		//ClassB.m6(); // Ok, the best practice
		// b.m8(); // Error for other package
		// ((ClassB) b).m8();
		// */
		/*-
		System.out.println("Test_0 ClassB.");
		ClassB b0;
		b0 = new ClassB();
		System.out.println("b0.i = " + b0.i); // from B
		b0.m1();
		b0.m2(); // i get from ClassA; fields not virtual
		b0.m3();
		b0.m4();
		b0.m5();
		b0.m6(); // running static from object is invalide solution
		b0.m8();
		//
		System.out.println("The End.");
		*/
	}
}
