package com.medium;

// Write a program to calculate the count of non-space characters in a string
public class Program4 {
	public static void main(String[] args) {
		String s = "automation testing";
		int count = 0;
		for (int i = 0; i <= s.length() - 1; i++) {
			char ch = s.charAt(i);
			if (ch !=' ') {
				count++;
			}
		}
		System.out.println("Total character is :" + count);
	}

}
