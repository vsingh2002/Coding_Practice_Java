package com.digitalocean;

import java.util.Scanner;

// Write a Java program to check if a vowel is present in a string
public class P3 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String st = s.toLowerCase();
		int count = 0;
		for (int i = 0; i <= st.length() - 1; i++) {
			char ch = st.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		if (count > 1) {
			System.out.println("String has a vowel");
		}

		else {
			System.out.println("String does not have a vowel");
		}
		sc.close();
	}

}
