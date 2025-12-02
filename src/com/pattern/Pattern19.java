package com.pattern;

import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i + 1; j++) {
				System.out.print("*");
			}
			for (int j = 1; j <= 2 * (i - 1); j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= rows - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = rows - 1; i >= 0; i--) {

			for (int j = 1; j <= rows - i; j++)
				System.out.print("*");
			for (int j = 0; j < 2 * i; j++)
				System.out.print(" ");
			for (int j = 1; j <= rows - i; j++)
				System.out.print("*");

			System.out.println();
		}

	}
}
