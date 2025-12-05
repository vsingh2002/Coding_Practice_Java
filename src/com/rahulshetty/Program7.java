package com.rahulshetty;

// Swapping two number
public class Program7 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swapping " + "a= " + a + " b= " + b);
		int c = a + b;
		a = c - a;
		b = c - b;
		System.out.println("After swapping " + "a= " + a + " b= " + b);
	}

}
