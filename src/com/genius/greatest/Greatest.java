package com.genius.greatest;

import java.util.Scanner;

// 재귀호출 최대공약수
public class Greatest {

	private static final int count = 1;

	private static int gcd(int input1, int input2) {
		if (input2 != 0) {
			System.out.println(count + "회 실행한다.");
			System.out.println("x = " + input1 + ", " + "y = " + input2);
			return gcd(input2, input1 % input2);
		} else {
			return input1;
		}
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.printf("%d 와 %d의 최대공약수는 = %d", x, y, gcd(x, y));
		}
	}
}