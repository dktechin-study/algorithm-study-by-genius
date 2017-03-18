package com.genius.order;

import com.genius.linkedList.LinkedList;

import java.util.Stack;

//중위운행법
public class Inorder {

	final static Stack<Node> l = new Stack();

	public static void main(String[] args) {

		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");

		a.left = b;
		a.right = c;

		b.left = d;
		b.right = e;

		recursive(a);
	}

	private static void recursive(Node node) {
		if (node == null) return;
		recursive(node.left);
		System.out.println(node.name);
		recursive(node.right);
	}
}
