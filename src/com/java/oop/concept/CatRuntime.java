
/*  its a polymorphism
 * runtime polymorphism
 * method is exist in the parents class
 * child call it ( extends , by creating obj)
 * child can modify the methods
 * print updated one 
 * 
 * if we create ath for dog its possible 
 * dog and cat is sibling , called "Has a" relationship
 * create dog obj here 
 *  we can have multiple level inheritance
 *  
 *  same method but differents application(override by child) = overriding and runtime polymorphism
 *  
 *  methods r overridden by child class = runtime polymorphism
 *  
 *  compile time polymorphism / methods overloading
 *  methods is same and signeture is changed  > overloading
 *  
 *  int sum(); int sum(int a , int b); int sum(int b,float c);
 *  its checked during the compile time
 *  
 *  we can do the method overload , by changing parameter / args and keep same name is called compile time polymorphism
 *   
 *  
 *  
 *  
 *  
 *  */





package com.java.oop.concept;

public class CatRuntime extends InheritanceAnimal{

	public static void main(String[] args) {
		
		CatRuntime s1= new CatRuntime();
		s1.sound();

		
		InheritanceDog s3 = new InheritanceDog(); // "Has a" relationship
		s3.sound();
		
		
	}
	
	void sound() {
		System.out.println("Cat makes sound..... Meaow...Meaow");
	}
	

}
