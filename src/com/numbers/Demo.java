package com.numbers;

import java.util.HashSet;

// Find Duplicate number
public class Demo {
	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 4 };
		HashSet<Integer> set = new HashSet<Integer>();
		for (Integer num : ar) {
			if (!set.add(num)) {
				System.out.println(num);
			}
		}
	}

}
