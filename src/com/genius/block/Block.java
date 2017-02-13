package com.genius.block;

import com.genius.codingDojang.AmusementPark;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

// 블록 쌓기 게임
public class Block {

	public static void main(String[] args) throws FileNotFoundException {
		String path = Block.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "Block.txt"));

		int N = sc.nextInt();
		int C = N * (N + 1) / 2;
		int[][] blocks = new int[N][N+1];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N + 1; j++) {
				blocks[i][j] = sc.nextInt();
			}
		}

		System.out.println(Arrays.deepToString(blocks));
	}
}