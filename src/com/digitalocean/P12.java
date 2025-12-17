package com.digitalocean;

// Find the sum of all elements in an integer array
public class P12 {
	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5, 1 };
		int sum = 0;
		for (int i = 0; i <= ar.length - 1; i++) {
			sum = sum + ar[i];
		}
		System.out.println("Sum of array elements is :" + sum);
	}
}
