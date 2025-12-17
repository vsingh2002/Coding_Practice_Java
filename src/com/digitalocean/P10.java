package com.digitalocean;

// Sort an array
public class P10 {
	public static void main(String[] args) {
		int ar[] = { 1, 7, 9, -1, 3, 5, 2, 4, 6 };
		for (int i = 0; i <= ar.length - 1; i++) {
			for (int j = i + 1; j <= ar.length - 1; j++) {
				if (ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}

		}
		for (int i = 0; i <= ar.length - 1; i++) {
			System.out.print(ar[i] + " ");
		}

	}

}
