package com.java.sycronization;

public class ThreadTest {

	public static void main(String[] args) {

		Add a=new Add();
		Thread1 t1=new Thread1(a);
		Thread2 t2=new Thread2(a);
		t1.start();
		t2.start();
		
	}

}
