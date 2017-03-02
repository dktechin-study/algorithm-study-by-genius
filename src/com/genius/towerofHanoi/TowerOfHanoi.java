package com.genius.towerofHanoi;

import java.util.Scanner;

public class TowerOfHanoi {

	static int n;
	static int cnt;

	public static void main(String[] args) {
		n = new Scanner(System.in).nextInt();
		hanoi(n, 1, 2);
		//System.out.println(cnt);
	}

	private static int hanoi(int n, int a, int b) {
		if (n == 0) {
			return 0;
		}
		hanoi(n - 1, a, 6 - a - b);
		System.out.printf("원판 %d를 %d에서 %d 으로 이동 \n", n, a, b);
		hanoi(n - 1, 6 - a - b, b);
		cnt++;
		return 0;
	}
}