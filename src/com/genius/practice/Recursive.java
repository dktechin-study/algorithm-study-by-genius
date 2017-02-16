package com.genius.practice;

/**
 * Created by genius on 2017. 2. 14..
 */
public class Recursive {

	public static void main(String[] args) {
		recursive(3,5);
	}

	public static void recursive(int n, int a) {

		System.out.println(n);

		if(n == a) return;
		recursive(++n, a);


	}
}
