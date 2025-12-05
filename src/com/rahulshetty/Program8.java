package com.rahulshetty;

import java.util.Scanner;

// Count capitalized words in String
public class Program8 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count = 0;
		for (int i = 0; i <= st.length() - 1; i++) {
			char ch = st.charAt(i);
			{
				if (ch >= 65 && ch <= 90) {
					count++;
				}
			}
		}
		System.out.println("Total capital letter words is : " + count);
		sc.close();
	}
}
