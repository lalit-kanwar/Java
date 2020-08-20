package com.java.newPrograme;

public class OrgumentTest {

	int x = 10;
	int y = 20;

	public static void main(String[] args) {

		System.out.println("main start");

		OrgumentTest t = new OrgumentTest();
		t.m1();
	}

	void m1() {
		System.out.println("m1 method ");

		System.out.println(this.x);
		System.out.println(this.y);
		int x = 50;
		System.out.println();

		System.out.println(this.x);
		System.out.println(this.y);
	}
}