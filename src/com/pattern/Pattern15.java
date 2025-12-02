package com.pattern;

import java.util.Scanner;

public class Pattern15 {
	public static void main(String[] args) {
		System.out.println("Enter the no. of rows");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			char c='A';
			for (int j = 1; j <= (rows - i) + 1; j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
