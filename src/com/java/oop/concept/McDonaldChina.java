// India > USA > Chaina  is a  "IS A " relationship
// India > USA > BD  is a  "HAS A " relationship , chaina and BD has same parents USA


package com.java.oop.concept;

public class McDonaldChina extends McDonaldUSA {

	public static void main(String[] args) {
		McDonaldChina mchiana = new McDonaldChina();
		mchiana.orderShushi(15);
		mchiana.orderHamburger(6);
		mchiana.orderDosa("Dosa", 5);
		mchiana.orderBiriyany(4);
		McDonaldUSA mcusa = new McDonaldUSA();

	}

	void orderShushi(int num) {
		System.out.println("Serving chinees food.");
		System.out.println("Ordered"+num+"shushi");
	}
}
