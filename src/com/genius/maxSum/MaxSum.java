package com.genius.maxSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MaxSum {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(MaxSum.class.getResource("").getPath() + "MaxSum.txt"));
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();

			List<Integer> list = new ArrayList();
			Set<Integer> max = new HashSet<>();

			for (int j = 0; j < m; j++) {
				list.add(sc.nextInt());
			}

			list.stream().reduce((a, b) -> {
				if (a < 0 || b < 0) {
					max.add(a > b ? a : b);
					return b;
				}
				max.add(a + b);
				return a + b;
			}).orElse(0);

			System.out.println(max);
			System.out.println(max.stream().max(Integer::compareTo).get());
		}
	}
}