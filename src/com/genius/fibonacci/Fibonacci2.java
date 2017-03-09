package com.genius.fibonacci;

public class Fibonacci2 {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(fibonacci(i));
		}
	}

	private static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fibonacci(n - 1) * fibonacci(n - 1) + fibonacci(n - 2);
	}
}