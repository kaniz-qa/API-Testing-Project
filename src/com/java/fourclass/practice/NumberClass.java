package com.java.fourclass.practice;

import java.text.DecimalFormat;

public class NumberClass {

	public static void main(String[] args) {
		float a=10;
		int b=3;
		float c=a/b;
		System.out.println(c);
		System.out.printf("%.2f",c);
		System.out.println();
		 System.out.println(String.format("%.3f", c)); 

		 
		 DecimalFormat dc= new DecimalFormat("00.00");
		 System.out.println("Division is: " +dc.format(c));
	}

}
