package com.genius.block;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// 블록 쌓기 게임
public class Block {

	public static void main(String[] args) throws FileNotFoundException {
		String path = Block.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "Block.txt"));

		int N = sc.nextInt();
		int C = N * (N + 1) / 2;
		Brick[] bricks = new Brick[C];
		int[][] map = new int[N][N + 1];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N + 1; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		int c = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				bricks[c] = new Brick(new Cell(j), new Cell(i));
				c++;
				if (i == j) break;
			}
		}

		//브릭 경우의 좌표 정리
		for (int i = 0; i < C; i++) {
			Brick brick = bricks[i];
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N + 1; k++) {
					// 가로
					if (k < N && brick.a.n == map[j][k] && brick.b.n == map[j][k + 1]) {
						brick.a.positions.add(new Position(k, j));
						brick.b.positions.add(new Position(k + 1, j));
					}
					// 세로
					if (j < N - 1 && brick.a.n == map[j][k] && brick.b.n == map[j + 1][k]) {
						brick.a.positions.add(new Position(k, j));
						brick.b.positions.add(new Position(k, j + 1));
					}
				}
			}
		}

		boolean[] visited = new boolean[C];
		int index = 0;

		while (true) {

			Position pa = null;
			Position pb = null;

			for (int i = 0; i < C; i++) {
				if (visited[index] != true) {
					index = i;
					for (int j = 0; j < bricks[i].a.positions.size(); j++) {
						pa = bricks[i].a.positions.get(j);
						pb = bricks[i].b.positions.get(j);
						System.out.printf("a = %d b = %d ax = %d ay = %d bx = %d, by = %d \n", bricks[i].a.n, bricks[i].b.n, pa.x, pa.y, pb.x, pb.y);
					}
				}
			}

			//for()

			visited[index] = true;
			if (pa == null) break;
		}
	}
}

class Brick {
	Cell a;
	Cell b;

	public Brick(Cell a, Cell b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "a = " + a.n + " b = " + b.n;
	}
}

class Cell {
	int n = 0;
	ArrayList<Position> positions = new ArrayList();

	public Cell(int n) {
		this.n = n;
	}
}

class Position {
	int x;
	int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}