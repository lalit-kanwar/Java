package com.java.sycronization;

public class Thread2 extends Thread{
Add a;
Thread2(Add a){
	this.a=a;
}
	public void run(){
		a.add(80,90);
	}
}
