package com.genius.codingDojang;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FindPrimeNumber {

	public static void main(String[] args) {
		Long start = new Date().getTime();
		System.out.println(find1(2, 50000));
		System.out.println(new Date().getTime() - start);

		start = new Date().getTime();
		System.out.println(find2(2, 50000));
		System.out.println(new Date().getTime() - start);
	}

	public static int find1(int s, int e) {
		int d = 0;
		for (int i = s; i <= e; i++) {
			int c = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					c = c + 1;
					break;
				}
			}
			if (c == 0) {
				d = d + 1;
			}
		}
		return d;
	}

	public static int find2(Integer s, Integer e) {
		List<Integer> prime = new ArrayList();
		prime.add(2);
		for (int i = s; i <= e; i++) {
			for (int j = 0; j < prime.size(); j++) {
				if (i % prime.get(j) == 0) break;
				if (j == prime.size() - 1) prime.add(i);
			}
		}
		return prime.size();
	}
}