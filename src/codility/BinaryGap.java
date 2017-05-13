package codility;

import java.util.Comparator;
import java.util.stream.Stream;

public class BinaryGap {

	public static void main(String[] args) {
		System.out.println(solution(1610612737));
	}

	public static int solution(int N) {
		return Stream.of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1+")).filter(a -> a != null).max(Comparator.comparing(String::length))
				.map(String::length).orElse(0);
	}
}