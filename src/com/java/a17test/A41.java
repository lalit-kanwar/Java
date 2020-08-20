package com.java.a17test;

public class A41 {

	void m1(Example1 e) {
		System.out.println("Example arg");
	}

	void m1(Test t) {
		System.out.println("test arg");
	}

	public static void main(String[] args) {

		A41 a = new A41();
		a.m1(new Example1());
		a.m1(new Sample1());
		// a.m1("abc");
		// a.m1(null);
		a.m1(new Test());
		a.m1((Sample1) null);
		a.m1((Test) null);
	}
}

class Example1 {
	static {
		// System.out.println("Example A41 load");
	}

}

class Test {
	static {
		// System.out.println("test A41 load");
	}
}

class Sample1 extends Example1 {
}