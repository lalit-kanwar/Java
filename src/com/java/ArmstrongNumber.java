package com.java;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] arg) {

		System.out.println("this is Armstrong Number programe  : ");
		/// System.out.println("pleae enter number up to you want to amongstrong number
		/// or not");
		System.out.print("plsease enter number to check amongstrong number : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		System.out.println("your entered number is : " + value);
		int sum = 0;
		/**
		 * for loop execution flow
		 * 
		 * -> initialization
		 * 
		 * -> condition
		 * 
		 * -> description
		 * 
		 * -> then iteration
		 */
		for (int i = value; i >= 1; i = i / 10) {
			int c = i % 10;
			sum = sum + (c * c * c);
			System.out.println("Sum : " + sum);
		}

		if (sum == value) {
			System.out.println(value + " is amongstrong number");
		} else {
			System.out.println("not a amongstrong number");
		}

	}

}
