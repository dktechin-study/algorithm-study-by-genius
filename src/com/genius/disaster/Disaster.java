package com.genius.disaster;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
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

		PriorityQueue<Position> priorityQueue = new PriorityQueue();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				String ch = sc.next();

				if (ch.equals("F")) {
					//System.out.println("Fire");
					//board[i][j] = m * n;
				}

				if (ch.equals("Y")) {
					//System.out.println("Start");
					board[i][j] = 1;
					priorityQueue.add(new Position(j, i, 1));
				}

				if (ch.equals("E")) {
					//System.out.println("Emergency");
					//board[i][j] = -1;
				}
			}
		}

		while (priorityQueue.size() > 0) {

			Position position = priorityQueue.poll();

			// 상
			if (position.posY > 0 && 0 == board[position.posY - 1][position.posX]) {
				board[position.posY - 1][position.posX] = position.dist + 1;
				priorityQueue.add(new Position(position.posX, position.posY - 1, position.dist + 1));
			}

			// 좌
			if (position.posX < 4 && 0 == board[position.posY][position.posX + 1]) {
				board[position.posY][position.posX + 1] = position.dist + 1;
				priorityQueue.add(new Position(position.posX + 1, position.posY, position.dist + 1));
			}
		}

		System.out.println(Arrays.deepToString(board));
	}
}

class Position implements Comparable<Position> {

	int posX;
	int posY;
	int dist;

	public Position(int posX, int posY, int dist) {
		this.posX = posX;
		this.posY = posY;
		this.dist = dist;
	}

	@Override
	public int compareTo(Position target) {
		return this.dist > target.dist ? 1 : this.dist < target.dist ? -1 : 0;
	}
}