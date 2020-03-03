package com.java.fourclass.practice;
import java.text.DecimalFormat;
public class MyConst {
	float a=10;
	int b=3;
	float c=a/b;
	
	//this is my edit
	MyConst(){
		System.out.println("This is default constructor .");
	}

	MyConst(String format){
		
		DecimalFormat dc = new DecimalFormat(format);
		String d=dc.format(c);
		System.out.println(d);
	}
	
	MyConst(int j){
		System.out.println("My favorite number :" +j);
	}
	MyConst(int j,int k){
		int p=j+k;
		System.out.println("Some of the number :" +(j+k));
		System.out.println("Some of the number :" +p);
	}
	
	MyConst(int j,float k){
		float p1=j+k;
		//System.out.println("Some of the number :" +(j+k));
		System.out.println("Some of the number :" +p1);
	}
	public static void main(String[] args) {
		 

                // crete the obj

		MyConst myObj =new MyConst();
		MyConst myObj2 = new MyConst("00.00");
		MyConst myObj3 = new MyConst(10);
		MyConst myObj4 = new MyConst(50,67);
		MyConst myObj5 = new MyConst(55,67.0f);
		
		System.out.println("Done");
	}

}
