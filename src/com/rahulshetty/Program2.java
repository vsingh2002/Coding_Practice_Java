package com.rahulshetty;

import java.util.Scanner;

// Reverse a String
public class Program2 {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		String rev = " ";
		for (int i = 0; i <= st.length() - 1; i++) {
			char ch = st.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reverse of a String is :" + rev);
		sc.close();
	}

}
