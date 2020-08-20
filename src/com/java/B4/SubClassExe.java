package com.java.B4;

class Test {
	static int a = 10;
	int b = 20;
}

public class SubClassExe extends Test {

	public static void main(String[] args) {

		System.out.println(Test.a);
		Test e = new Test();
		System.out.println(e.b);

		System.out.println(".........");
		System.out.println(SubClassExe.a);
		SubClassExe s = new SubClassExe();
		System.out.println(s.b);
	}

}
