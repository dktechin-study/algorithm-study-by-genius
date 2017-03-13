package com.genius.backpacking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// 현재의 최단 경로는 이후의 경로에 따라 비용이 최소가 아닐 수 있다.
// 결국 모든 경로를 다 가봐야 한다. 다만 이전 방문 위치를 못가도록 범위를 줄인다.
public class Backpacking {

	static int t = 0;
	static int n = 0;
	static int d = 0;
	static int f = 0;
	static int ff = 99999;
	static int[][] nn;
	static boolean[] v = new boolean[n];

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(Backpacking.class.getResource("").getPath() + "Backpacking.txt"));

		t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			n = sc.nextInt();
			nn = new int[n][n];

			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					nn[j][k] = sc.nextInt();
				}
			}

			v = new boolean[n];
			v[0] = true;
			recursive(0);
			System.out.println(ff);
		}
	}

	private static void recursive(int i) {

		v[i] = true;
		d = d + 1;

		if (d == n) {
			//System.out.println(nn[i][0]);
			if (ff > f + nn[i][0]) {
				ff = f + nn[i][0];
			}
			//System.out.println("============");
			return;
		}

		for (int k = 0; k < n; k++) {
			if (nn[i][k] != 0 && !v[k]) {
				//System.out.println(nn[i][k]);
				f = f + nn[i][k];
				recursive(k);
			}
		}
	}
}