package com.genius;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm2 {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<List<Integer>> group = new ArrayList<>();
		int size = list.size();
		int remain = size % 2;
		int loop = list.size() / 2;
		if (remain != 0) loop++;
		for (int i = 0; i < loop; i++) {
			int s = i * 2;
			int e = s + 2;
			if (e > size) {
				e = size;
			}
			group.add(list.subList(s, e));
		}
		System.out.println(list);
		System.out.println(group);

		String str = "ABC";
		String str1 = "";

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);

		int n = 20;
		List l = new ArrayList();
		while (n > 0) {
			int temp = n / 2;
			l.add(n % 2);
			n = temp;
		}
		System.out.println(l);
	}
}