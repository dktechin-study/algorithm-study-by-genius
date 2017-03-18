package com.genius.codingDojang;

import java.util.ArrayList;
import java.util.List;

public class LISPCalculator {

	public static void main(String[] args) {
		String[] strings = "(* (+ 2 3) (- 5 3))".split("");

		Node root = null;
		Node temp = null;

		for (int i = 0; i < strings.length; i++) {
			final String mg = strings[i];
			if (mg.equals("(*") || mg.equals("(/") | mg.equals("(+") | mg.equals("(-")) {
				if (root == null) {
					root = new Node(mg, new ArrayList<>());
					temp = root;
				} else if (temp.left == null) {
					temp.left = new Node(mg, new ArrayList<>());
				} else if (temp.right == null) {
					temp.right = new Node(mg, new ArrayList<>());
					temp = temp.left;
				}
			} else if(mg.equals(")")) {

			}
		}

		recursive(root);
	}

	private static void recursive(Node node) {
		if (node == null) return;
		recursive(node.left);
		recursive(node.right);
		System.out.println(node.operation);
	}
}

class Node {
	Node left;
	Node right;
	String operation;
	List<Integer> numbers;
	Integer result = 0;

	public Node(String operation, List<Integer> numbers) {
		this.operation = operation;
		this.numbers = numbers;
	}
}