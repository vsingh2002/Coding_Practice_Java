package com.rahulshetty;

// Input - aabbbcccc Output - a2b3c4
public class Program12 {
	public static void main(String[] args) {
		String s = "abb";
		int count = 1;
		for (int i = 1; i <= s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				System.out.println(s.charAt(i - 1) + " " + count);
				count = 1;
			}
		}
		System.out.println(s.charAt(s.length() - 1) + " " + count);
	}
}
