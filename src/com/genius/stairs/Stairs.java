package com.genius.stairs;

import java.util.ArrayList;
import java.util.List;

public class Stairs {

	public static void main(String[] args) {
		Integer n = 7;
		//Integer[] stairs = {10, 20, 15, 25, 10, 20};
		Integer[] stairs = {13, 1, 15, 27, 29, 21, 20};
		List<Integer> list = new ArrayList<>();

		list.add(stairs[n-1]);

		for (int i = n-1; i > 0; i--) {
			Integer a = stairs[i] + stairs[i - 1 < 0 ? 0 : i - 1];
			Integer b = stairs[i] + stairs[i - 2 < 0 ? 0 : i - 2];

			if (a > b) {
				list.add(a - stairs[i]);
			} else {
				list.add(b - stairs[i]);
				i = i - 1;
			}
		}
		System.out.println(list.toString());
		System.out.println(list.stream().mapToInt(Integer::intValue).sum());

//		Integer[] solutions = new Integer[8];
//		Arrays.fill(solutions, 0);
//
//		solutions[0] = 0;
//		solutions[1] = stairs[0];
//		solutions[2] = stairs[0] + stairs[1];
//
//		for (int i = 3; i <= n; i++) {
//			solutions[i] = max(stairs[i - 1] + stairs[i - 2] + solutions[i - 3], stairs[i - 1] + solutions[i - 2]);
//			System.out.println(stairs[i-1]);
//		}
//
//		System.out.println(Arrays.toString(solutions));
	}

	static Integer max(Integer a, Integer b) {
		return a > b ? a : b;
	}
}
