package com.medium;

// Write a program to find duplicate characters in a given String.
public class Program1 {
	public static void main(String[] args) {
		String s = "character";
		int count[] = new int[256];
		char ch[] = s.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			count[ch[i]]++;
		}
		System.out.println("Duplicate character in the string is ");
		for (int i = 0; i <= count.length - 1; i++) {
			if (count[i] > 1) {
				System.out.println((char) i + " " + count[i]);
			}
		}
	}

}
