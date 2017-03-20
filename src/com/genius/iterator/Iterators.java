package com.genius.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		for (Integer i : numbers) {
			System.out.println(i);
		}

		Iterator<Integer> iterator = numbers.iterator();

		int[] ns = new int[]{1, 2, 3, 4, 5};

		for (int i : ns) {
			System.out.println(i);
		}

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
