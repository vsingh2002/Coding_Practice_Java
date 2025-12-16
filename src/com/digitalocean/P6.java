package com.digitalocean;

import java.util.ArrayList;
import java.util.List;

// Check if a list of integers contains only odd numbers in Java
public class P6 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(5);
		l.add(3);
		l.add(9);
		int flag = 0;
		for (Integer i : l) {
			if (i % 2 == 0) {
				flag = 1;
			}
		}
		if (flag == 1) {
			System.out.println("List have even number");
		} else {
			System.out.println("List have only odd number");
		}

	}

}
