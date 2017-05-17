package codingDojang;

import java.text.NumberFormat;

public class EuclidProblem {

	public static void main(String[] args) {
		System.out.println(gcd(6, 4));

		double aa  = 0.1233343;
		double bb  = 1;
		NumberFormat defaultFormat =  NumberFormat.getPercentInstance();
		defaultFormat.setMinimumFractionDigits(2);
		System.out.println(defaultFormat.format(aa));
		System.out.println(defaultFormat.format(bb));
	}

	private static int gcd(int a, int b) {
		int c = a % b;
		return c == 0 ? b : gcd(b, c);
	}
}