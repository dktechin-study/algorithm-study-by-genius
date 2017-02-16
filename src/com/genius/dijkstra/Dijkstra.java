package com.genius.dijkstra;

import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {

	static final int inf = 99999;
	static final int vCount = 7;
	static final int[][] graph = {
			{0, 7, inf, inf, 3, 10, inf},
			{7, 0, 4, 10, 2, inf, inf},
			{inf, 4, 0, 2, inf, 6, inf},
			{inf, 10, 2, 0, 11, 9, 4},
			{3, 2, inf, 11, 0, inf, 5},
			{10, inf, 6, 9, inf, 0, inf},
			{inf, inf, inf, 4, 5, inf, 0}
	};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		solved(sc.nextInt(), sc.nextInt());
	}

	private static void solved(int start, int end) {
		boolean[] isVisits = new boolean[vCount];
		int[] distance = new int[vCount];
		int[] historyPath = new int[vCount];
		int min = 0;
		int nextVertex = 0;

		for (int i = 0; i < vCount; i++) {
			isVisits[i] = false;
			distance[i] = inf;
			historyPath[i] = inf;
		}

		distance[start] = 0;

		while (true) {

			min = inf;
			for (int i = 0; i < vCount; i++) {
				if (isVisits[i] == false && distance[i] < min) {
					nextVertex = i;
					min = distance[i];
				}
			}

			if (min == inf) {
				break;
			}

			isVisits[nextVertex] = true;

			for (int j = 0; j < vCount; j++) {
				int d = distance[nextVertex] + graph[nextVertex][j];
				if (distance[j] > d) {
					distance[j] = d;
					historyPath[j] = nextVertex;
				}
			}
		}

		System.out.println(Arrays.toString(distance));
		System.out.println(Arrays.toString(historyPath));
	}
}
