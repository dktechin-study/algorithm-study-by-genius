package com.genius.newYearsBow;

public class NewYearsBow {

	static int cents[] = {3, 2, 1};

	public static void main(String[] args) {
		System.out.println(bow(5, 0));
	}

	private static int bow(int i, int j) {
		if (i == 0) {
			return 1;
		} else if (i < 0 || j >= cents.length) {
			return 0;
		}
		return bow(i - cents[j], j) + bow(i, j + 1);
	}
}