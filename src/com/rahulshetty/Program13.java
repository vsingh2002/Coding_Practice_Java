package com.rahulshetty;

// Print product of an array itself
public class Program13 {
	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5 };
		int product = 1;
		for (int i = 0; i <= ar.length - 1; i++) {
			product = product * ar[i];
		}
		System.out.println("Product of an array is :" + product);
	}

}
