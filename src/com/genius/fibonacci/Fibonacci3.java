package com.genius.fibonacci;

import java.util.HashMap;
import java.util.Map;

//https://www.acmicpc.net/blog/view/28
public class Fibonacci3 {

	static final long mod = 1000000L;
	static final long n = 10000000L;
	static final long p = n / 10 * 15;
	static Map<Long, Long> pib = new HashMap();

	static {
		pib.put(1L, 0L);
		pib.put(2L, 1L);
	}

	public static void main(String[] args) {
		for (long i = 3; i <= p; i++) {
			pib.put(i, pib.get(i - 2L) + pib.get(i - 1L));
			pib.put(i, pib.get(i) % mod);
		}
		System.out.println(pib.get(n % (p)));
	}
}