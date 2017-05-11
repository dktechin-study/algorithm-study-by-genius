package codility;

public class BinaryGap {

	public static void main(String[] args) {
		solution(20);
	}

	public static int solution(int n) {
		String[] arr = Integer.toBinaryString(n).split("");
		int temp = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				temp = temp + 1;
				if (temp > max) max = temp;
			} else {
				temp = 0;
			}
		}
		System.out.println(max);
		return max;
	}
}