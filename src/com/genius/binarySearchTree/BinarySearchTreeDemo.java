package com.genius.binarySearchTree;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.add(10);
		binarySearchTree.add(15);
		binarySearchTree.add(5);
		binarySearchTree.add(2);
		binarySearchTree.add(1);
		binarySearchTree.add(11);

		System.out.println(binarySearchTree.search(5).left);
		System.out.println(binarySearchTree.search(5).right);
		System.out.println(binarySearchTree.search(10).left);
		System.out.println(binarySearchTree.search(10).right);
		System.out.println(binarySearchTree.search(15).left);
	}
}

