package com.rahulshetty;

// Find duplicate character count and remaining character count
public class Program17 {
	public static void main(String[] args) {
		String s = "congratulation";
		int count[] = new int[256];
		char ch[] = s.toCharArray();
		for (int i = 0; i <= ch.length - 1; i++) {
			count[ch[i]]++;
		}
		System.out.println("Duplicate character count");
		for (int i = 0; i <= count.length - 1; i++) {

			if (count[i] > 1) {

				System.out.println((char) i + " " + count[i]);
			}
		}
		System.out.println("Remaining character count");
		for (int i = 0; i <= count.length - 1; i++) {
			if (count[i] == 1) {
				System.out.println((char) i + " " + count[i]);
			}
		}
	}

}
