package com.genius.combination;

import java.util.Arrays;

public class Combination {

	public static void main(String[] args) {
		comb(0, 225, 15, 0, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14});
	}

	private static void comb(int s, int n, int r, int t, int[] arr) {
		if (r == 0) {
			System.out.println(Arrays.toString(arr));
			//print(arr, s);
		} else if (n == t) {
			return;
		} else {
			arr[s] = t;
			comb(s + 1, n, r - 1, t + 1, arr);
			comb(s, n, r, t + 1, arr);
		}
	}

	public static void print(int[] arr, int length) {
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] % 15 + " ");
		}
		System.out.println("");
	}

}
