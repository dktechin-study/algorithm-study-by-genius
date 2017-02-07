package com.genius.codingDojang;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class AmusementPark {

	public static void main(String[] args) throws FileNotFoundException {
		String path = AmusementPark.class.getResource("").getPath();
		Scanner sc = new Scanner(new File(path + "AmusementPark.txt"));

		int size = sc.nextInt();
		int targetSum = sc.nextInt();
		int[] dolls = new int[size];

		for (int i = 0; i < size; i++) {
			dolls[i] = sc.nextInt();
		}
		Arrays.sort(dolls);
		System.out.println(Arrays.toString(dolls));
	}
}
