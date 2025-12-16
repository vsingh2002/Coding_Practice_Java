package com.medium;

// Write a program to remove duplicate characters in a given String.
public class Program2 {
	public static void main(String[] args) {
		String s = "madam";
		int count[] = new int[256];
		char ch[] = s.toCharArray();
		String result = " ";
		for (int i = 0; i <= ch.length - 1; i++) {
			if (count[ch[i]] == 0) {
				result = result + ch[i];

			}

			count[ch[i]]++;
		}
		System.out.println("String after removing duplicate is :" + result);

	}

}
