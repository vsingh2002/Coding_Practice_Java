package com.numbers;

// Print all divisions
import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Division of a number " + num + " is ");
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ",");
			}
		}
	}

}
