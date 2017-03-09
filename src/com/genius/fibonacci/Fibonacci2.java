package com.genius.fibonacci;

import java.math.BigDecimal;

public class Fibonacci2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(fibonacci(BigDecimal.valueOf(i)));
		}
	}

	private static BigDecimal fibonacci(BigDecimal n) {
		if (n.equals(BigDecimal.ZERO)) {
			return BigDecimal.ZERO;
		}
		if (n.equals(BigDecimal.ONE)) {
			return BigDecimal.ONE;
		}
		return (fibonacci(n.subtract(BigDecimal.ONE)).multiply(fibonacci(n.subtract(BigDecimal.ONE)))).add(fibonacci(n.subtract(BigDecimal.valueOf(2))));
	}
}