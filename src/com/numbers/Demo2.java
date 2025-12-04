package com.numbers;

import java.util.Scanner;

// Reverse a number
public class Demo2 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;
		}
		System.out.println("Reverse of a number is :" + rev);
		sc.close();
	}

}
