package com.digitalocean;

// find second largest element in an array
public class P13 {
	public static void main(String[] args) {
		int ar[] = { 10, 20, 2, 5, 30, 32, 34 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > max) {
				secondMax = max;
				max = ar[i];

			} else if (ar[i] > secondMax && ar[i] != max) {
				secondMax = ar[i];

			}
		}

		System.out.println("Second Max element in array is :" + secondMax);
	}
}
