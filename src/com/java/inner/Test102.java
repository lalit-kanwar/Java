package com.java.inner;

class A101 {
	AExample m1() {
		class B implements AExample {
			@Override
			public void m3() {
				System.out.println("B m3");
			}
		}
		B b = new B();
		m2(b);
		return b;
	}

	void m2(AExample o) {
		o.m3();
	}
}

interface AExample {
	void m3();
}

public class Test102 {
	public static void main(String[] arg) {
		A101 a = new A101();
		AExample e = a.m1();
		e.m3();
	}
}