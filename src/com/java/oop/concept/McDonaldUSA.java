package com.java.oop.concept;

public class McDonaldUSA extends McDonadlsIndia{

	McDonaldUSA(){
		System.out.println("Welcome to McDonald's USA--");
	}
	public static void main(String[] args) {
		
		McDonaldUSA mcusa = new McDonaldUSA();
		mcusa.orderHamburger(20);
		mcusa.orderDosa(" Plain Dosa", 12);
		mcusa.orderBiriyany(23);
	}
	
	void orderHamburger(int num) {
		System.out.println("Serving American Hamburgar.");
		System.out.println("Ordered "+num+" Hamburgers");
	}
	
	
}
