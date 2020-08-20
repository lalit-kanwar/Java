package com.java.a17test;

public class A40 {
	static {
		System.out.println("A class load");
	}

	void m1(Example e) {
		System.out.println("Example arg");
	}

	void m1(Sample s) {
		System.out.println("Sample arg");
	}

	public static void main(String[] args) {
		A40 a = new A40();
		a.m1(new Example());
		a.m1(new Sample());
		// a.m1("abc");
		a.m1(null);

		Example e1 = new Example();
		Example e2 = new Sample();
		Example e3 = null;

		Sample s1 = new Sample();
		Sample s2 = null;
		System.out.println(".................");
		a.m1(e1);
		a.m1(e2);
		a.m1(s1);
		a.m1(e3);
		a.m1(s2);
	}
}

class Example {
	static {
		System.out.println();
		System.out.println("Example class load");
	}
};

class Sample extends Example {
	static {
		System.out.println();
		System.out.println("Sample class Load");
	}
};
