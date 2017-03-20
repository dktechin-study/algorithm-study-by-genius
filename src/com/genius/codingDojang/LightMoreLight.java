package com.genius.codingDojang;

import java.util.*;

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
			BitSet bbs = new BitSet(b);
			for (int j = 1; j <= b; j++) {
				System.out.println(j + " " + new Date().getTime());
				for (int k = 1; k <= b; k++) {
					if (k % j == 0) {
						bbs.set(k - 1);
						bs.xor(bbs);
					}
				}
				bbs.clear();
			}
			System.out.println(bs.get(b - 1) ? "no" : "yes");
		}
	}
}