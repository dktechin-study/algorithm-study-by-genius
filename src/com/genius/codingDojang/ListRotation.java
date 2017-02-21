package com.genius.codingDojang;

import java.util.*;

public class ListRotation {

	public static void main(String[] args) {
		List<String> ss = Arrays.asList(new Scanner(System.in).nextLine().split(" "));
		LinkedList<String> sss = new LinkedList<>(ss.subList(1, ss.size()));
		Integer r = Integer.valueOf(ss.get(0));

		while (r > 0) {
			sss.push(sss.pollLast());
			r--;
		}

		while (r < 0) {
			sss.addLast(sss.pollFirst());
			r++;
		}

		sss.forEach(i -> System.out.print(i + " "));
	}
}