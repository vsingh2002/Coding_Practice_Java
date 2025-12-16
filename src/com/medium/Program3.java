package com.medium;

// Write a program to reverse a given string
public class Program3 {
	public static void main(String[] args) {
		String s = "vishal";
		String rev = "";
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			rev = ch + rev;
		}
		System.out.println("Reverse of a String is :" + rev);
	}

}
