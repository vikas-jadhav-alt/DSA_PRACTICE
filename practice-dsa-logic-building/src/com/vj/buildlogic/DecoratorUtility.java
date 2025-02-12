package com.vj.buildlogic;

public class DecoratorUtility {

	static void doubleDividerHeading(String text) {

		System.out.println("=====================================");
		System.out.println("         " + text + "                    ");
		System.out.println("=====================================");

	}
	static void singleDividerHeading(String text) {
		
		System.out.println("--------------------------------------");
		System.out.println("           " + text + "           " );
		System.out.println("---------------------------------------");
		
	}
	
	
	static void oneLineSeparator(String text) {
		
		System.out.println("---------------------------------------------");
		
	}
}
