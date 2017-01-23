package com.genius.linkedList;

import java.util.NoSuchElementException;

public class LinkedList {

	private Node head;
	private int size;

	public Node pop() {
		if (head == null) throw  new NoSuchElementException();
		Node temp = head;
		head = temp.getNext();
		size--;
		return temp;
	}

	public void push(Node node) {
		if (head == null) {
			head = node;
		} else {
			node.setNext(head);
			head = node;
		}
		size++;
	}

	public Node get(int index) {
		if (size <= index) throw new IndexOutOfBoundsException();
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.getNext();
		}
		return temp;
	}

	public void add(Node node, int index) {
		if (index == 0) {
			head = node;
		} else {
			Node temp = head;
			for (int i = 0; i < index - 1; i++) {
				temp = temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
		}
		size++;
	}

	public void delete(int index) {
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.getNext();
		}
		temp.setNext(temp.getNext().getNext());
		size--;
	}

	public Node getHead() {
		return head;
	}
}
