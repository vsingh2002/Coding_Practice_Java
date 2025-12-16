package com.digitalocean;

import java.util.Scanner;

// check whether a string is a palindrome or not in Java
public class P7 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		String rev = "";
		String temp = string;
		for (int i = 0; i <= string.length() - 1; i++) {
			char ch = string.charAt(i);
			rev = ch + rev;
		}
		if (rev.equals(temp)) {
			System.out.println("It's a Palindrome string");
		} else {
			System.out.println("It's not a palindrome string");
		}
		sc.close();
	}
}
