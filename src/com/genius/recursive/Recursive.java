package com.genius.recursive;

import java.util.BitSet;

public class Recursive {

	public static void main(String[] args) {
		recursive(3, 5);

		String s;
		StringBuffer sbf;
		StringBuilder sbl;

		BitSet bs = new BitSet(20);
		bs.set(0);
		bs.set(0);
		bs.set(1);
		System.out.println(bs);
	}

	private static int recursive(int a, int b) {
		System.out.println(a + " before");
		if (a == b) return 0;
		recursive(a + 1, b);
		System.out.println(a + " after");
		return 0;
	}

	//private static native int recursive(int a, int b, int c);
}