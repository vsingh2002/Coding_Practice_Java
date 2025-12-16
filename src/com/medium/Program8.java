package com.medium;

import java.util.Scanner;

// Write a program to check whether the year is leap or not.
public class Program8 {
	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " not a leap year");
		}
		sc.close();
	}

}
