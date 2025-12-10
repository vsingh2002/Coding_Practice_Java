package com.rahulshetty;

// Find second largest number from an array
public class Program16 {
	public static void main(String[] args) {
		int ar[] = { -1, -4, -10, 1, 4 };
		int max = ar[0];

		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		int smax = Integer.MIN_VALUE;
		for (int i = 0; i <= ar.length - 1; i++) {
			if (ar[i] > smax && ar[i] < max) {
				smax = ar[i];
			}
		}
		System.out.println("Second max in array is :" + smax);

	}

}
