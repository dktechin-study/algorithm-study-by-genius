package com.genius.smartPhone;

import java.io.*;
import java.util.Scanner;

public class SmartPhone {

	public static void main(String[] args) throws IOException {
		String path = SmartPhone.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "sample.txt"));

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			solved(sc);
		}
	}

	private static void solved(Scanner sc) {
		int F = sc.nextInt();
		int E = sc.nextInt();
		int N = sc.nextInt();

		int[] S = new int[E - F + 1];
		int[] P = new int[N];
		int[] W = new int[N];

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			P[i] = a;
			W[i] = b;
		}

		S[0] = 0;
		for (int i = 1; i < E - F + 1; i++) {
			S[i] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= E - F - W[i]; j++) {
				if (S[j] + P[i] < S[j + W[i]]) {
					S[j + W[i]] = S[j] + P[i];
				}
			}
		}

		System.out.println("스마트폰의 최소 실행 시간 = " + S[E - F]);
	}
}