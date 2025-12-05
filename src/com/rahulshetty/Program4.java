package com.rahulshetty;

import java.util.Scanner;

// Sum of digits of a number
public class Program4 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}
		System.out.println("Sum of a number is :" + sum);
		sc.close();
	}
}
