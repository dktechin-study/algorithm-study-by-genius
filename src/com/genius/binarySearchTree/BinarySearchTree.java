package com.genius.binarySearchTree;

import java.util.NoSuchElementException;
import java.util.function.BiFunction;

public class BinarySearchTree {

	private Node root;

	public void add(int value) {
		Node temp = root;
		Node node = new Node(value);
		if (root == null) root = node;
		while (temp != null) {
			if (temp.value == value) return;
			if (temp.value > value) {
				if (temp.left == null) {
					temp.left = node;
				} else {
					temp = temp.left;
				}
			} else {
				if (temp.right == null) {
					temp.right = node;
				} else {
					temp = temp.right;
				}
			}
		}
	}

	BiFunction<Node, Node, Node> biFunction = (Node p, Node t) -> {
		if (p.value > t.value) {
			p.left = null;
		} else {
			p.right = null;
		}
		return t;
	};

	public Node delete(int value) {
		Node target = search(value);
		Node parent;
		if (target == null) throw new NoSuchElementException();
		if (target.left == null && target.right == null) {
			parent = searchParent(value);
			return biFunction.apply(parent, target);
		}
		return target;
	}

	public Node search(int value) {
		Node temp = root;
		while (temp != null) {
			if (temp.value == value) return temp;
			if (temp.value > value) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		return null;
	}

	public Node searchParent(int value) {
		Node temp = root;
		Node parent = null;
		while (temp != null) {
			if (temp.value == value) return parent;
			parent = temp;
			if (temp.value > value) {
				temp = temp.left;
			} else {
				temp = temp.right;
			}
		}
		return null;
	}
}