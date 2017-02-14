package com.genius.codingDojang;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class FromTo {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> numbers = new ArrayList<>();
		IntStream.range(sc.nextInt(), sc.nextInt()).forEach(i -> numbers.addAll(Arrays.asList(String.valueOf(i).split("")).stream().map(Integer::valueOf).collect(toList())));
		Map<Integer, Long> map = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);
	}
}
