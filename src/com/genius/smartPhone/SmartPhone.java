package com.genius.smartPhone;

import java.io.*;
import java.util.Scanner;

public class SmartPhone {

	public static void main(String[] args) throws IOException {
		String path = SmartPhone.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "sample.txt"));

		int T = sc.nextInt();
		int E = sc.nextInt();
		int F = sc.nextInt();
		int N = sc.nextInt();

		int[] P = new int[N];
		int[] W = new int[N];

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			P[i] = a;
			W[i] = b;
		}
	}
}
