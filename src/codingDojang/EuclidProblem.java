package codingDojang;

public class EuclidProblem {

	public static void main(String[] args) {
		System.out.println(gcd(6, 4));
	}

	private static int gcd(int a, int b) {
		int c = a % b;
		return c == 0 ? b : gcd(b, c);
	}
}