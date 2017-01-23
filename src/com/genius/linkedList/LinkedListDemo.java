package com.genius.linkedList;

/**
 * Created by Genius on 2017-01-24.
 */
public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		linkedList.push(new Node("node1"));
		linkedList.push(new Node("node2"));
		linkedList.push(new Node("node3"));
		System.out.println(linkedList.getHead().getName());
		System.out.println(linkedList.getHead().getNext().getName());
		System.out.println(linkedList.getHead().getNext().getNext().getName());
		System.out.println("--------------------------------------");
		System.out.println(linkedList.pop().getName());
		System.out.println(linkedList.pop().getName());
		System.out.println(linkedList.pop().getName());
		System.out.println("--------------------------------------");
		linkedList.add(new Node("node1"), 0);
		linkedList.add(new Node("node2"), 1);
		linkedList.add(new Node("node3"), 2);
		linkedList.add(new Node("node4"), 1);
		System.out.println(linkedList.get(0).getName());
		System.out.println(linkedList.get(1).getName());
		System.out.println(linkedList.get(2).getName());
		System.out.println(linkedList.get(3).getName());
		System.out.println("--------------------------------------");
		linkedList.delete(1);
		linkedList.delete(2);
		//System.out.println(linkedList.get(0).getName());
		//System.out.println(linkedList.get(1).getName());
		System.out.println(linkedList.get(2));
	}
}
