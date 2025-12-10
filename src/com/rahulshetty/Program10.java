package com.rahulshetty;

// Find Duplicates of a given String
public class Program10 {
	public static void main(String[] args) {
		String s = "madam";
		int count[] = new int[256];
		// char[] c = s.toCharArray();
		for (char ch : s.toCharArray()) {
			count[ch]++;
		}
//		for (int i = 0; i <= c.length - 1; i++) {
//			count[c[i]]++;
//		}
		for (int i = 0; i <= count.length - 1; i++) {
			if (count[i] > 1) {
				System.out.println((char) i);
			}
		}

	}

}
