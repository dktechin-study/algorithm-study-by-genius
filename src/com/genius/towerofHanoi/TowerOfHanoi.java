package com.genius.towerofHanoi;

import java.util.Scanner;

public class TowerOfHanoi {

	static int n;
	static int cnt;

	public static void main(String[] args) {
		n = new Scanner(System.in).nextInt();
		hanoi(n, 0, 0);
		System.out.println(cnt);
	}

	private static int hanoi(int n, int a, int b) {
		if (n == 0) {
			return 0;
		}
		hanoi(n - 1, 1, 1);
		System.out.printf("%d %d %d \n", n, a, b);
		hanoi(n - 1, 2, 2);
		cnt++;
		return 0;
	}
}