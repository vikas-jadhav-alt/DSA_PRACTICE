package com.vj.buildlogic;

public class Testing {

	public static void main(String[] args) {

		int x = 5;
		int y = 6;
		int z = (x == 5) ? --y : --y;
		System.out.println(y);// 5
		System.out.println(z);// 5

		// At this Position

		z = (x == 6) ? ++y : ++y;
		System.out.println(y);// 6
		System.out.println(z);// 6

		DecoratorUtility.doubleDividerHeading("Raised to Power");

		// how to assign raised to power values
		// using scientific notation of double/float value
		int j = (int) 3E5;
		System.out.println(j);// 300000
		// using multiplication
		System.out.println(5 * 10_000);// 50000
		// Using Math.pow
		System.out.println((int) Math.pow(2, 5));// 2^5 = 32
		// using Bitwise Left Shift Operator
		System.out.println(1 << 5); // 32

		// For Readability use underscore
		int kk = 300_000_000;
		System.out.println(kk);// 300000000

		DecoratorUtility.doubleDividerHeading("Valid Syntax in Java");

		// Ternary Operator Test Condition: Only true/false or expression returning
		// true/false
		// CTE: Type mismatch: cannot convert from int to boolean
//		int t =  (5) ? --y : --y ;//invalid
		int t = (true) ? --y : --y; // VALID

//		while(1) {} // invalid Only true/false
//		while(true) {}	//VALID

		DecoratorUtility.doubleDividerHeading("Multiple Statement in For Loop");

		for (int p = 0; p < 5; System.out.print("Incrementing: "), System.out.println(p++)) {
			System.out.println("In loop: " + p);
		}

	}

}
