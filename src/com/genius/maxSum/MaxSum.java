package com.genius.maxSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(MaxSum.class.getResource("").getPath() + "MaxSum.txt"));
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int sum;
			List<Integer> list = new ArrayList();

			for (int j = 0; j < m; j++) {
				list.add(sc.nextInt());
			}

			sum = list.stream().reduce((a, b) -> {
				System.out.printf("a = %d, b = %d \n", a, b);
				if (a < 0 || b < 0) {
					return a > b ? a : b;
				}
				return a + b;
			}).orElse(0);

			System.out.println(sum);
		}
	}
}