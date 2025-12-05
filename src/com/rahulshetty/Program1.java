package com.rahulshetty;

import java.util.Scanner;

// Swap two String
public class Program1 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		System.out.println("Before swapping st1 is : " + st1 + " and st2 is : " + st2);
		String st3 = st1;
		st1 = st2;
		st2 = st3;
		System.out.println("After swapping st1 is : " + st1 + " and st2 is : " + st2);
		sc.close();

	}

}
