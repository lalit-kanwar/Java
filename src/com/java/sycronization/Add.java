package com.java.sycronization;

public class Add {
int x,y;
//synchronized 
void add(int x,int y){
	this.x=x;
	this.y=y;
	
	try{
	Thread.sleep(1000);
	}catch(InterruptedException e){
		e.printStackTrace();
	}
	int res=this.x+this.y;
	System.out.println("In "+Thread.currentThread().getName()+" Result is :"+res);
}
}
