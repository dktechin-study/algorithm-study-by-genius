package com.genius.disaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// 재난 관리 프로젝트
public class Disaster {

	static int[][] board;

	public static void main(String[] args) throws FileNotFoundException {
		String path = Disaster.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "Disaster.txt"));

		final int m = sc.nextInt();
		final int n = sc.nextInt();
		final int x = sc.nextInt();

		boardInit(sc, m, n);

	}

	private static void boardInit(Scanner sc, int m, int n) {

		board = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				String ch = sc.next();

				board[i][j] = 0;

				if (ch.equals("F")) {
					System.out.println("Fire");
					board[i][j] = m * n;
				}

				if (ch.equals("Y")) {
					System.out.println("Start");
					board[i][j] = 1;
				}

				if (ch.equals("E")) {
					System.out.println("Emergency");
				}
			}
		}
		System.out.println(Arrays.deepToString(board));
	}
}
