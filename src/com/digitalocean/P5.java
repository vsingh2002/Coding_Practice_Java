package com.digitalocean;

// Program to print a fibonacci series
public class P5 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i <= 5; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
		}
	}

}
