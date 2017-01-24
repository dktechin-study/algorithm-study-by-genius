package com.genius.zigzag;

public class ZigZag {

	public static void main(String[] args) {
		int k = 1;
		int j = 5;
		int t = j * j;
		for (int i = 1; i <= t; i++) {
			System.out.print(k + "\t");
			if (i % j == 0 && ((i / j) % 2 == 1)) {
				System.out.println("");
				k = k + j + 1;
			} else if (i % j == 0 && ((i / j) % 2 == 0)) {
				System.out.println("");
				k = i;
			}
			if ((i / j) % 2 == 1) {
				k--;
			} else {
				k++;
			}
		}
	}
}