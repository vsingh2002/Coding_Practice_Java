package com.rahulshetty;

import java.util.Stack;

// Reverse a number using stack
public class Program15 {
	public static void main(String[] args) {
		int num = 1234;
		Stack<Integer> stack = new Stack<Integer>();
		while (num > 0) {
			int d = num % 10;
			stack.push(d);
			num = num / 10;
		}
		int reverse = 0;
		int place = 1;
		while (!stack.isEmpty()) {
			reverse = reverse + stack.pop() * place;
			place = place * 10;
		}

	}
}
