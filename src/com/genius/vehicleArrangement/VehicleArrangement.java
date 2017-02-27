package com.genius.vehicleArrangement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by genius on 2017. 2. 27..
 */
public class VehicleArrangement {

	public static void main(String[] args) {
		Integer[] heights = new Integer[]{75, 30, 100, 38, 50};
		List<Integer> list = new ArrayList<>();

		IntStream.range(0, 5).forEach(i -> {list.add(heights[i]);});

		System.out.println(list.stream().min(Integer::compareTo).get());

	}
}
