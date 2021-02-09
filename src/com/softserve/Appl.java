package com.softserve;

import com.softserve.edu.Calc;

public class Appl {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println("2 + 2 = " + c.add(2, 2));
		System.out.println("20 + 4 = " + c.div(20, 4));
	}
}
