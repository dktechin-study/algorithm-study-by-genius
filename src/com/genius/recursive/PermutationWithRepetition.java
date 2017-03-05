package com.genius.recursive;


import java.util.Arrays;

//https://ko.wikipedia.org/wiki/%EC%88%9C%EC%97%B4#.EC.A4.91.EB.B3.B5_.EC.88.9C.EC.97.B4
public class PermutationWithRepetition {

	static int[] t = new int[3];
	static int[] d = new int[]{1, 2, 3, 4};

	public static void main(String[] args) {
		pwr(4, 3, 3);
	}

	private static void pwr(int n, int r, int q) {
		if (r == 0) {
			System.out.println(Arrays.toString(t));
			return;
		}
		for (int i = n - 1; i >= 0; i--) {
			swaping(i, n - 1);
			t[r - 1] = d[n - 1];
			pwr(n, r - 1, q);
			swaping(i, n - 1);
		}
	}

	private static void swaping(int i, int j) {
		int t = d[i];
		d[i] = d[j];
		d[j] = t;
	}
}
