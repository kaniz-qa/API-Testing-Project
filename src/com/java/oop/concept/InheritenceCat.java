// cat is an animal " IS A" relationship
//Animal > dog > germanshephard ,germanshephard is an animal and also is a dog , all r "IS A"
//super class is a immediate parent class

//up casting 
//loose coupling

//animal type reference variable can hold it



package com.java.oop.concept;

public class InheritenceCat extends InheritanceAnimal{

	public static void main(String[] args) {
		InheritenceCat c = new InheritenceCat();
		c.eat();
		c.move();
		c.sound();
		
		
		
		System.out.println("Color : "+(c.color ="white") +" ,"+ (("Legs :")+(c.legs = 4 )));
		

	}

}
