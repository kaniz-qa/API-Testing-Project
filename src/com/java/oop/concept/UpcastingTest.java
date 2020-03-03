package com.java.oop.concept;

public class UpcastingTest {

	public static void main(String[] args) {
		
		InheritanceAnimal a = new InheritenceCat();// type is animal type , cat only can implement animal class methods 
		InheritanceAnimal b = new InheritanceDog();
		
		a.sound();
		b.sound();

	}

}
