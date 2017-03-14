package com.genius.codingDojang;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class LandMineSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] a = new String[n][m];

		for (int i = 0; i < n; i++) {
			String[] line = sc.next().split("");
			for (int j = 0; j < m; j++) {
				a[i][j] = line[j];
			}
		}
		System.out.println(Arrays.deepToString(a));
	}
}
