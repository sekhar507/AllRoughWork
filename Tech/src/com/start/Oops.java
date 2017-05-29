package com.start;

public class Oops {

	int a=10;
}


class Advanced extends Oops{
	int b=20;
	
	public static void main(String[] args) {
		Advanced advanced= new Advanced();
		
		System.out.println(advanced.a);
		System.out.println(advanced.b);
		
	}
}