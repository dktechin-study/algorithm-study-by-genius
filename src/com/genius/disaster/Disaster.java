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
	static int m = 0;
	static int n = 0;
	static int x = 0;
	static int f = 0;
	static int count = 0;
	static int round = 1;

	public static void main(String[] args) throws FileNotFoundException {
		String path = Disaster.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "Disaster.txt"));

		m = sc.nextInt();
		n = sc.nextInt();
		x = sc.nextInt();
		f = m * n;
		boardInit(sc, m, n, x);

	}

	private static void boardInit(Scanner sc, int m, int n, int x) {

		board = new int[m][n];

		PriorityQueue<Position> priorityQueue = new PriorityQueue();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				String ch = sc.next();

				if (ch.equals("F")) {
					//System.out.println("Fire");
					board[i][j] = m * n;
				}

				if (ch.equals("Y")) {
					//System.out.println("Start");
					board[i][j] = 1;
					priorityQueue.add(new Position(j, i, 1));
				}

				if (ch.equals("E")) {
					//System.out.println("Emergency");
					board[i][j] = -1;
				}
			}
		}

		while (priorityQueue.size() > 0) {

			Position position = priorityQueue.poll();

			if (round != position.dist) {
				round = position.dist;
				if (round > x && (round - 1) % x == 0) {
					System.out.println("===Fire===");
					int[][] temp = new int[m][n];
					for (int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							if (board[i][j] == f) {
								//상하좌우
								if (i > 0) temp[i - 1][j] = f;
								if (i < m - 1) temp[i + 1][j] = f;
								if (j > 0) temp[i][j - 1] = f;
								if (j < n - 1) temp[i][j + 1] = f;
							}
						}
					}

					for (int i = 0; i < m; i++) {
						for (int j = 0; j < n; j++) {
							if (temp[i][j] == f) board[i][j] = temp[i][j];
						}
					}
				}
			}

			int cx = 0;
			int cy = 0;

			// 상하좌우
			if (position.posX < m - 1 && 0 >= board[position.posY][position.posX + 1]) {
				cx = position.posX + 1;
				cy = position.posY;
				priorityQueue.add(new Position(cx, cy, position.dist + 1));
				System.out.println(cy + " " + cx + " " + (position.dist + 1) + " " + " L");

			}

			if (position.posX > 0 && 0 >= board[position.posY][position.posX - 1]) {
				cx = position.posX - 1;
				cy = position.posY;
				priorityQueue.add(new Position(cx, cy, position.dist + 1));
				System.out.println(cy + " " + cx + " " + (position.dist + 1) + " " + " L");
			}

			if (position.posY < n - 1 && 0 >= board[position.posY + 1][position.posX]) {
				cx = position.posX;
				cy = position.posY + 1;
				priorityQueue.add(new Position(cx, cy, position.dist + 1));
				System.out.println(cy + " " + cx + " " + (position.dist + 1) + " " + " D");
			}

			if (position.posY > 0 && 0 >= board[position.posY - 1][position.posX]) {
				cx = position.posX;
				cy = position.posY - 1;
				priorityQueue.add(new Position(cx, cy, position.dist + 1));
				System.out.println(cy + " " + cx + " " + (position.dist + 1) + " " + " D");
			}

			if (board[cy][cx] == -1) {
				System.out.println("탈출");
				break;
			}
			board[cy][cx] = position.dist + 1;
		}
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

	@Override
	public String toString() {
		return posY + " " + posX + " " + dist;
	}
}