package com.java.oop.concept;

public class InheritanceAnimal {
	
	String color;
	int legs;

	public static void main(String[] args) {
		InheritanceAnimal a = new InheritanceAnimal();
		a.eat();
		a.move();
		a.sound();
		

	}
	
	void eat() {
		System.out.println("Animal can eat.");
	}
	void sound() {
		System.out.println("Animal makes sound.");
	}
	
	void move() {
		System.out.println("Animal can move. ");
	}

}
