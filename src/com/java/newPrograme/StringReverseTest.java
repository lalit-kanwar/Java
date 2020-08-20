package com.java.newPrograme;

public class StringReverseTest {

	public static void main(String[] args) {

		String s1 = "Hi this is lalit";

		String s2[] = s1.split(" ");

		String s3 = "";
		for (int i = s2.length - 1; i >= 0; i--) {

			s3 = s3 + s2[i] + " ";

		}
		System.out.println(s3);

	}

}
