package codility;

import java.util.Arrays;

/**
 * Created by genius on 2017. 5. 12..
 */
public class TapeEquilibrium {

	public static void main(String[] args) {
		System.out.println(solution(new int[]{1000, -1000}));
		System.out.println(solution(new int[]{-1000, 1000}));
		System.out.println(solution(new int[]{3, 1, 2, 4, 3}));
		System.out.println(solution(new int[]{-3, -1, -2, -4, -3}));
	}

	public static int solution(int[] A) {
		int m = Math.abs(Arrays.stream(A).sum());
		int d = 0;
		int f = Integer.MAX_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			m -= A[i] * 2;
			if (m < f) f = d;
		}
		return f;
	}
}
