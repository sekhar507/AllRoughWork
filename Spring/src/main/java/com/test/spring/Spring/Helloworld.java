package com.test.spring.Spring;

public class Helloworld {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printName()
	{
		System.out.println("Welcome" + name);
	}

}
