package com.pattern;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
//			for (int j = 1; j <= 2 * rows - (2 * i + 1); j++) {
//				System.out.print("*");
//			}
			for (int j = 0; j < (2 * (rows - i) - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
