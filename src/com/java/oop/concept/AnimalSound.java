
// loose coupling achieved  by upcasting


package com.java.oop.concept;

import java.util.Scanner;

public class AnimalSound extends InheritanceAnimal{
	
	
	InheritanceAnimal soundTest(String str) {
		InheritanceAnimal a = null  ;
		switch (str) {
		case "dog ":
			a = new InheritanceDog();
			break;
			
		case "german ":
			a = new InheritanceDog();
			break;
			
		
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sounds are avaialable");
		System.out.println("Please enter ur choise ");
		String str = sc.next().toLowerCase().trim();
		
		AnimalSound sound = new AnimalSound();
		InheritanceAnimal an = sound.soundTest(str);
		an.sound();
		sc.close();
	}

}
