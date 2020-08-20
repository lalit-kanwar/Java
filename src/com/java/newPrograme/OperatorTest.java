package com.java.newPrograme;

public class OperatorTest {

	public static void main(String[] args) {

		int i1 = +5;
		int i2 = -6;
		boolean b1 = !true;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(b1);

		int i11 = 7 + 8;
		int i22 = 7 | 8;
		int i33 = 7 & 8;
		boolean b00 = 7 < 8;
		boolean b11 = 7 == 8;

		System.out.println(i11);// 15
		System.out.println(i22);// 15
		System.out.println(i33);// 0
		System.out.println(b00);// true
		System.out.println(b11);// false

		System.out.println(true ? "Hi" : "Hello");
		System.out.println(false ? "Hi" : "Hello");

		String s1 = true ? "Hi" : "Hello";
		System.out.println(s1);
		System.out.println(".....");

		String s2;
		if (true) {
			s2 = "Hi...";

		} else {
			s2 = "Hello...";

		}
		System.out.println(s2);
	}

}
