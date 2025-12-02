package com.pattern;

import java.util.Scanner;

public class Pattern17 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows - i; j++) {
				System.out.print(" ");
			}
			char c = 'A';
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(c);
				if (j < i) {
					c++;
				} else {
					c--;
				}

			}
			System.out.println();
		}

	}
}
