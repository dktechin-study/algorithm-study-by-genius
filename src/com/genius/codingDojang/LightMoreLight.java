package com.genius.codingDojang;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class LightMoreLight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		List<BitSet> l = new ArrayList();
		while (sc.hasNext()) {
			int i = sc.nextInt();
			if (i == 0) break;
			BitSet bs = new BitSet();
			bs.set(0, i);
			l.add(bs);
		}

		for (int i = 0; i < l.size(); i++) {
			BitSet bs = l.get(i);
			int b = bs.length();
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= b; k++) {
					if (k % j == 0) {
						BitSet bbs = new BitSet(b);
						bbs.set(k - 1);
						bs.xor(bbs);
					}
				}
			}
			System.out.println(bs.get(b - 1) ? "no" : "yes");
		}
	}
}