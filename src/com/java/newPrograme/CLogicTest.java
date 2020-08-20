package com.java.newPrograme;

public class CLogicTest {

	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		boolean k = true;
		for (; k;) {

			k = (i++ <= 5);
			System.out.println(i + " " + j);
		}
	}

}
