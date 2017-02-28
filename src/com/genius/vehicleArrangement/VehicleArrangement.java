package com.genius.vehicleArrangement;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class VehicleArrangement {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(new File(VehicleArrangement.class.getResource("").getPath() + "VehicleArrangement.txt"));

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int l = sc.nextInt();

			Integer[] heights = new Integer[m];

			for (int j = 0; j < m; j++) {
				heights[j] = sc.nextInt();
			}

			for (int k = 0; k < l; k++) {
				List<Integer> list = new ArrayList<>();
				IntStream.range(sc.nextInt(), sc.nextInt()).forEach(t -> list.add(heights[t]));
				System.out.println(list.stream().min(Integer::compareTo).orElse(0));
			}

			System.out.println("");
		}
	}
}
