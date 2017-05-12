package codility;

import java.util.Arrays;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(328));
	}

	public static int solution(int n) {
		String[] arr = Integer.toBinaryString(n).split("");
		int temp = 0;
		int max = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				temp++;
				if (temp > max) max = temp;
			} else {
				temp = 0;
			}
		}
		return max;
	}
}