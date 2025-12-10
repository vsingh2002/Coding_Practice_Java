package com.rahulshetty;

// Reverse the array
public class Program9 {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4 };
		int start = 0;
		int end = ar.length - 1;
		while (start < end) {
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
