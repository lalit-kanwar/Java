package com.java.newPrograme;

public class VariableInitializationTest {
	int a = 10;
	{
		System.out.println("a" + a);
		System.out.println("b" + this.b);
	}

	public static void main(String[] args) {
		VariableInitializationTest t = new VariableInitializationTest();
		System.out.println("main start");
		System.out.println("a" + t.a);
		System.out.println("b" + t.b);

	}

	int b = 20;

}
