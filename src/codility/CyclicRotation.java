package codility;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		solution(new int[]{3, 8, 9, 7, 6}, 6);
	}

	public static int[] solution(int[] A, int K) {
		int l = A.length;
		int[] temp = new int[l];
		for (int i = 0; i < l; i++) {
			temp[(i + K) % l] = A[i];
		}
		System.out.println(Arrays.toString(temp));
		return temp;
	}
}