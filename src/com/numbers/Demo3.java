package com.numbers;

import java.util.Scanner;
// Check palindrome

public class Demo3 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev = 0;
		int palindrome = num;
		while (num > 0) {
			int d = num % 10;
			rev = rev * 10 + d;
			num = num / 10;

		}
		if (rev == palindrome) {
			System.out.println("It is a palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
		sc.close();
	}
}
