package com.pattern;

import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		char c = 'A';
		for (int i = 1; i <= rows; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");

			}
			c++;
			System.out.println();

		}
	}

}
