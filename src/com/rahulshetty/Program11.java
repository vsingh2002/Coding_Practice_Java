package com.rahulshetty;

// Longest Consecutive number
public class Program11 {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 20, 30 };
		for (int i = 1; i <= ar.length - 1; i++) {
			for (int j = 1; j <= ar.length - i - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					int temp = ar[j];
					ar[j] = ar[j + 1];
					ar[j + 1] = temp;

				}
			}
		}
		int longest = 1;
		int current = 1;
		for (int i = 1; i <= ar.length - 1; i++) {
			if (ar[i] == ar[i - 1] + 1) {
				current++;
			} else if (ar[i] != ar[i - 1]) {
				current = 1;
			}
			if (current > longest) {
				longest = current;
			}
		}
		System.out.println("Longest consecutive number is :" + longest);

	}

}
