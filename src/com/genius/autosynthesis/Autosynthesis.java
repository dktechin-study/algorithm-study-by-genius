package com.genius.autosynthesis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Autosynthesis {

	public static void main(String[] args) throws FileNotFoundException {

		String path = Autosynthesis.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "sample.txt"));

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			solved(sc);
		}
	}

	private static void solved(Scanner sc) {
		int N = sc.nextInt();
		int[] C = new int[N];
		int[] D = new int[N];

		for (int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}

		division(D, C, N);
	}

	private static void division(int[] d, int[] c, int n) {

		System.out.println(Arrays.toString(c));

		int R = -1;
		boolean continues = true;

		while (continues) {
			d[n - 2] = c[n - 1];
			d[1] = c[2] - d[3];

			d[0] = c[0] - d[1];

			d[2] = c[1] - d[0];
			d[4] = c[3] - d[2];

			R++;
			System.out.println(Arrays.toString(d));

			c = Arrays.copyOf(d, d.length);

			if (Arrays.stream(c).anyMatch(i -> i < 0)) {
				continues = false;
			}
		}
		System.out.println("==================");
		System.out.println(R + " 회 분할");
	}
}