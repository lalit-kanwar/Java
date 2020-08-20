package com.java;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("comment executed");

		System.out.println(m1());
		System.out.println("end main");
	}

	static int m1() {
		System.out.println("m1 method executing");
		return 10;
	}

}
