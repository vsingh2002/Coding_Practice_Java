package com.numbers;

import java.util.Scanner;

// Count Number digits
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("Enter the number");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		while (num > 0) {
			int d = num % 10;
			count++;
			num = num / 10;
		}

		System.out.println("Number of digits is :" + count);
		sc.close();
	}
}
