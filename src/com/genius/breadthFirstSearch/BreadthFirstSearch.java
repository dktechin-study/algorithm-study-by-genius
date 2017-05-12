package com.genius.breadthFirstSearch;

import java.util.Arrays;
import java.util.Scanner;

public class BreadthFirstSearch {

	private static int n = 0;
	private static int rear = 0;
	private static int front = 0;
	private static int map[][] = new int[30][30];
	private static int queue[] = new int[30];
	private static int visit[] = new int[30];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int start = sc.nextInt();

		int v1, v2;

		while (true) {
			v1 = sc.nextInt();
			v2 = sc.nextInt();
			if (v1 == -1 && v2 == -1) break;
			map[v1][v2] = map[v2][v1] = 1;
		}
		solution(start);
	}

	private static void solution(int v) {
		int i;
		visit[v] = 1;
		queue[rear++] = v;
		while (front < rear) {
			v = queue[front++];
			for (i = 1; i <= n; i++) {
				if (map[v][i] == 1 && visit[i] != 1) {
					visit[i] = 1;
					System.out.printf("%d 에서 %d로 이동\n", v, i);
					queue[rear++] = i;
				}
			}
		}
	}
}
