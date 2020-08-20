package exception;

import java.util.Scanner;

public class ExceptionTestUser {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("plz enter 1st value");
		int a = scn.nextInt();
		System.out.println("plz enter 2nd value");
		int b = scn.nextInt();

		ExceptionTest test = new ExceptionTest();
		test.Dividing(a, b);
	}

}
