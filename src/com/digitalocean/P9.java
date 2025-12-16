package com.digitalocean;

import java.util.Scanner;

// How do you remove leading and trailing spaces from a string in Java
public class P9 {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		System.out.println("Before removing leading and trailing space :" + st);
		st=st.trim();
		System.out.println("After removing leading and trailing space :" + st);
		sc.close();
	}

}
