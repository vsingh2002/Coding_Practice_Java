package com.digitalocean;

import java.util.Scanner;

// Find factorial of a number in the given range
public class P11 {
	public static void main(String[] args) {
		System.out.println("Enter the number to find the factorial");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorail of a number is : " + fact);
		sc.close();
	}

}
