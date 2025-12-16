package com.digitalocean;

import java.util.Scanner;

//  Write a Java program to check if the given number is a prime number
public class P4 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}
		sc.close();

	}

}
