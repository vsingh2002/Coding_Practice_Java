package com.rahulshetty;

// Product of an array except itsef
public class Program14 {
	public static void main(String[] args) {
		int ar[] = { 2, 3, 4, 5 };
		for (int i = 0; i <= ar.length - 1; i++) {
			int product = 1;

			for (int j = 0; j <= ar.length-1; j++) {
				if (i != j) {
					product = product * ar[j];
				}
			}
			System.out.println(product);
		}
	}
}
