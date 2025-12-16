package com.medium;

// Write a program to swap the two strings using temp variable
public class Program5 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Java";
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("After swapping s1 is" + " " + s1 + " " + "s2 is" + " " + s2);
	}

}
