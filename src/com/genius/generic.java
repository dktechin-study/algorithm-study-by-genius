package com.genius;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Genius on 2017-04-09.
 */
public class generic {


	public static void main(String[] args) {
		countGreaterThan1(new Integer[]{1, 3}, 1);

		List<Apple> apples = new ArrayList<Apple>();
		apples.add(new Apple());

		//We can assign a list of apples to a basket of apples
		List<? super Apple> basket = new ArrayList<>();

		basket.add(new Apple());      //Successful
		basket.add(new AsianApple()); //Successful
		//basket.add(new Fruit());      //Compile time error


		Collections.addAll(basket, new AsianApple());

		List<Apple> apples2 = new ArrayList<Apple>();
		apples2.add(new Apple());
		//We can assign a list of apples to a basket of fruits;
		//because apple is subtype of fruit
		List<? extends Fruit> basket2 = apples2;
		basket2.add(null);
		//basket2.add(new Fruit());
		//basket2.add(new Apple());

		for (Fruit fruit : basket2) {
			System.out.println(fruit);
		}
	}

	public static <T extends Comparable<? super T>> int countGreaterThan1(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}

	public static <T extends Comparable<T>> int countGreaterThan2(T[] anArray, T elem) {
		int count = 0;
		for (T e : anArray)
			if (e.compareTo(elem) > 0)
				++count;
		return count;
	}
}

class Fruit {
	@Override
	public String toString() {
		return "I am a Fruit !!";
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "I am an Apple !!";
	}
}

class AsianApple extends Apple {
	@Override
	public String toString() {
		return "I am an AsianApple !!";
	}
}