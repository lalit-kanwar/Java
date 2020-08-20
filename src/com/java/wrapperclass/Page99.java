package com.java.wrapperclass;

public class Page99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b1=50;
		int i1=b1;
		
		int i2=50;
		//byte b2=i2;
		byte b3=(byte)i2;
		
		int i3='a';
		
		double d1=50;
		double d2=60L;
		double d3=70.34f;
		double d4=30.45;
		
		//double d5=true;
		
		//byte b11=new Integer(50);;
		int i11=new Byte(b1);
		
		int i22=new Integer(50);
		//byte b22=new Integer(i2);
		byte b33=(byte)new Integer(i2).intValue();
		
		int i33=new Character('a');
		
		double d11=new Integer(50);
		double d22=new Long(60L);
		double d33=new Float(70.34f);
		double d44=new Double(30.45);
		
		//double d5=new Boolean(true);
		
	}

}
