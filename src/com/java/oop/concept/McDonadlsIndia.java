//design of a building is class and building itself is a object


package com.java.oop.concept;

public class McDonadlsIndia {
	
	McDonadlsIndia(){
		System.out.println("Welcome to the McDonalds :");
	}

	
	void orderDosa(String dosa, int num) {
		System.out.println("Orderd "+num+ dosa);
	}
	
	void orderBiriyany(int num) {
		System.out.println("Orderd "+num+" plates of biriyani.");
	}
	
	
	static public  void main(String[] args) {
		McDonadlsIndia mcindia=new McDonadlsIndia();
		McDonadlsIndia mcusa=new McDonadlsIndia();
		mcindia.orderDosa(" Masala dosa",10);
		mcindia.orderBiriyany(13);
}
}