package com.pattern;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns");
		int columns = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
