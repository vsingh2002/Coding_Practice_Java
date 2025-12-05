package com.rahulshetty;

import java.util.Scanner;

// Count no. of characters in a given string
public class Program6 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		int count = 0;
		for (int i = 0; i <= st.length() - 1; i++) {
			char ch = st.charAt(i);
			if (ch != ' ') {
				count++;
			}

		}
		System.out.println("Number of character is :" + count);
		sc.close();
	}

}
