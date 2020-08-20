package com.java;

public class Operatortest {
	public static void main(String[] args) {
		int a = 5, b = 4, c = 3;
		a = ++a + a++;
		b = b-- + b++;
		c = --c + c--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
