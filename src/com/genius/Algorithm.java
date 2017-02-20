package com.genius;

import java.util.Scanner;

/**
 * Created by genius on 2017. 2. 17..
 */
public class Algorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		solve(n);
		solve2(n);
	}

	private static void solve2(int n) {
		for (int i = 0; i < 1666; i++) {
			for (int j = 0; j < 1000; j++) {
				if ((3 * i) + (5 * j) == n) {
					System.out.println("3 = " + i + ", 5 = " + j);
					return;
				}
			}
		}
		System.out.println("-1");
	}

	private static void solve(int n) {
		if (n % 5 == 0) {
			System.out.println(n / 5);
			return;
		}

		if ((n % 5) % 3 == 0) {
			System.out.println((n / 5) + (n % 5) / 3);
			return;
		}

		int k = (n / 5) - 1;
		while (k > 0) {
			if ((n - k * 5) % 3 == 0) {
				System.out.println(k + ((n - k * 5) / 3));
				return;
			}
			k--;
		}

		if ((n % 3) == 0) {
			System.out.println(n / 3);
			return;
		}

		System.out.println("-1");
	}
}