package baekjoon.p1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		float m = 0;
		for (int i = 0; i < n; i++) {
			m += sc.nextInt();
		}
	}
}
