package com.java.a43test;

public class ValidOverride extends Example {
	@Override
	void m1(int x, int y) {
		System.out.println("bm1");
	}

	@Override
	public void m2() {
		System.out.println("bm2");
	}

	public int m3(String s) {
		System.out.println("m3");
		return 10;
	}

	@Override
	public void m4(double d, float f) {
		System.out.println("m4");
		// return 20.34f;
	}

	@Override
	public void m5() {
		System.out.println("m5");
	}

	// @Override
	public static void m6(float f, int i) {
		System.out.println("m6");
	}

	static int m7() {
		System.out.println("m7");
		return 10;
	}

	@Override
	void m8() {
		System.out.println("m8");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
