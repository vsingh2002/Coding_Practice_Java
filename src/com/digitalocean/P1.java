package com.digitalocean;

import java.util.Scanner;

// Reverse a string in Java
public class P1 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String st = scanner.nextLine();
		String rev = "";
		for (int i = 0; i <= st.length() - 1; i++) {
			char ch = st.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reverse of a string is :" + rev);
		scanner.close();
	}

}
