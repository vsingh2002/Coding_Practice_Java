package com.digitalocean;

// swap two numbers without using a third variable in Java
public class P2 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		a = a + b; // 30
		b = a - b; // 30-20 = 10

		a = a - b; // 30-10 = 20
		System.out.println("After swapping a is : " + a);
		System.out.println("After swapping b is : " + b);

	}

}
