package com.genius.queue;

import java.util.NoSuchElementException;

//선입선출
public class Queue {

	private Node head;

	public void push(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (head.next != null) {
				temp = head.next;
			}
			temp.next = node;
		}
	}

	public Node pop() {
		if (head == null) throw new NoSuchElementException();
		Node temp = head;
		head = temp.next;
		return temp;
	}
}
