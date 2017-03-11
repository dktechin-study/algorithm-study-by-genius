package com.genius.codingDojang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class MatrixSum {

	private static int len = 12;
	private static int max = 0;
	private static int[][] matrix = new int[len][len];
	private static List<int[]> perms = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(MatrixSum.class.getResource("").getPath() + "MatrixSum.txt"));

		IntStream.range(0, len).forEach(i -> IntStream.range(0, len).forEach(j -> matrix[i][j] = sc.nextInt()));

		perm(0, len, IntStream.range(0, len).toArray());

		IntStream.range(0, perms.size()).forEach(i -> {
			int t = 0;
			for (int j = 0; j < len; j++) {
				t = t + matrix[j][perms.get(i)[j]];
			}
			if (t > max) max = t;
		});

		System.out.println(max);
	}

	private static void perm(int s, int n, int[] arr) {
		if (n == s) {
			perms.add(Arrays.copyOf(arr, arr.length));
			return;
		}

		IntStream.range(s, n).forEach(i -> {
			if (i != s) swap(i, s, arr);
			perm(s + 1, n, arr);
			if (i != s) swap(i, s, arr);
		});
	}

	private static void swap(int i, int s, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[s];
		arr[s] = temp;
	}
}