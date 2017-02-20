package com.genius.irreduciblefraction;

public class IrreducibleFraction {

	public static void main(String[] args) {
		factorial(2, 0);
	}

	public static void factorial(int n, int d) {
		if (n == d) return;
		for (int i = d; i < n; i++) {
			System.out.println(d + " 상 " + i);
			factorial(n, d + 1);
			System.out.println(d + " 하 " + i);
		}
	}
}