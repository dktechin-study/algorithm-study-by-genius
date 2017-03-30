package codingDojang;

import java.util.*;
import java.util.stream.Collectors;

/*
* 주어진 입력을 오름차순으로 정렬하고 2개의 데크를 이용 하면 가능 할 듯
* */
public class SafePassage {
	public static void main(String[] args) {
	//	Integer[] a = Arrays.stream("1,2,3,4,5".split(",")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
	//	Integer[] b = Arrays.stream("1,2,3,4,5".split(",")).mapToInt(Integer::valueOf).boxed().toArray(Integer[]::new);
		//System.out.println(Arrays.toString(Arrays.stream("1,2,3,4,5".split(",")).map(Integer::valueOf).collect(Collectors.toList()).toArray(new Integer[0])));
		System.out.println(Arrays.toString(Arrays.stream("1,2,3,4,5".split(",")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new)));
	}
}