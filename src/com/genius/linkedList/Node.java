package com.genius.linkedList;

public class Node {

	private Node prev;
	private Node next;
	private String name;

	public Node(String name) {
		this.name = name;
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getName() {
		return name;
	}
}
