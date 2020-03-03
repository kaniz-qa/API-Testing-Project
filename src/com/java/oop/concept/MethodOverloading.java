package com.java.oop.concept;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading mn = new MethodOverloading();
		mn.sum(23);

	}

	void sum(int am) {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

	int sum() {
		int a = 10;
		int b = 10;
		int c = a + b;
		return c;
	}

	void sum(int v, int n) {
		int a = 10;
		int b = 10;
		int c = a + b;
		System.out.println(c);
	}

	void sum(int a, float b) {
		float c = a + b;
		System.out.println(c);
	}

	void sum(int a, int b, float c) {
		float d = a + b + c;
		System.out.println(d);
	}
}
