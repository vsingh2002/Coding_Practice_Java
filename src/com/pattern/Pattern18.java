package com.pattern;

import java.util.Scanner;

public class Pattern18 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (char ch = (char) ('E' - (i - 1)); ch <= 'E'; ch++) {
				System.out.print(ch);

			}
			System.out.println();
		}

	}
}
