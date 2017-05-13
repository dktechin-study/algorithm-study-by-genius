package codility;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(328));
	}

	public static int solution(int N) {
		String[] arr = Integer.toBinaryString(N).split("");
		int len = arr.length;
		int temp = 0;
		int max = 0;
		for (int i = 0; i < len; i++) {
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