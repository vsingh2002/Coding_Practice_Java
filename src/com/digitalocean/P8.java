package com.digitalocean;

import java.util.Scanner;

// How do you remove spaces from a string in Java
public class P8 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String st = scanner.nextLine();
		String result = "";
		for (int i = 0; i <= st.length() - 1; i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				result = result + ch;
			}

		}
		System.out.println("After removing space string is :" + result);
		scanner.close();
	}

}
