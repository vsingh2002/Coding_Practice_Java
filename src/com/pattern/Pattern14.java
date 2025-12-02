package com.pattern;

import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			char c = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(c + " ");
				c++;
			}
			System.out.println();
		}
//			for (char c = 'A'; c < 'A' + i; c++) {
//				System.out.print(c + " ");
//			}
//			System.out.println();
//
//		}

	}
}
