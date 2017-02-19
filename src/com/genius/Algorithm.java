package com.genius;

import java.util.Scanner;

/**
 * Created by genius on 2017. 2. 17..
 */
public class Algorithm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = n / 5;
		int e = (n - (d * 5)) % 3;

		if ((e != 0 && (n % 5) != 0 && (n % 3) != 0) || n > 5000 || n < 3) {
			System.out.print("-1");
		} else {
			if ((n % 5) == 0 && (n % 3) == 0) {
				System.out.println(n / 5);
			} else if ((n % 5) == 0) {
				System.out.println(n / 5);
			} else if ((n % 3) == 0) {
				System.out.println(n / 3);
			} else {
				System.out.print(d + 1);
			}
		}
	}
}