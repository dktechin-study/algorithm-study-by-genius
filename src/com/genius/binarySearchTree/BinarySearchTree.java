package com.genius.binarySearchTree;

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

	public void delete(int value) {

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
}