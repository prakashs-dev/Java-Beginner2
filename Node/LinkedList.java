package com.Node;

import java.util.NoSuchElementException;
import java.util.Scanner;

class LearnLinkedList {

	public class Node {
		private int value;
		private Node next;

		public Node(int num) {
			this.value = num;
		}
	}

	private Node first; // head node
	private Node last; // tail node
	private int size = 0;

//	check list is empty or not
	public boolean isEmptyList() {
		if (first == null) {
			return true;
		}
		return false;
	}

//	add number list from last 
	public void addLast(int item) {
		Node nums = new Node(item);
		if (isEmptyList()) {
			first = last = nums;
		} else {
			last.next = nums;
			last = nums;
		}
		size++;
//		System.out.println("last :"+last.value+" last :"+last.next+" size :"+ ++size);
	}

	public void addFirst(int item) {
		Node nums = new Node(item);
		if (isEmptyList()) {
			first = last = nums;
		} else {
			nums.next = first;
			first = nums;
		}
		size++;
//		System.out.println("first :"+first.value+" last :"+last.value+" size :"+ ++size);
	}

	public int isValue(int item) {
//		get the parameter of Node value return the corresponding index
		int index = 0;
		Node current = first;
		while (current != null) {
			if (current.value == item)
				return index;

			current = current.next;
			index++;
		}
		return -1;
	}

	public int isIndexOf(int idx) {
//		get the parameter of List of index return the corresponding Node value
		Node currentElement = first;
		if (idx > size) {
			return -1;
		}

		for (int i = 0; i < size; i++) {
			if (i == idx)
				return currentElement.value;

			currentElement = currentElement.next;
		}
		return -1;
	}

//	remove first node of value
	public void removeFirst() {
		if (isEmptyList()) {
			throw new NoSuchElementException();
		}
		if (first == last) {
			first = last = null;
		} else {
			Node sec = first.next;
			first.next = null;
			first = sec;
		}
		size--;
	}
	
	public void printLinkList() {
		Node temp = first;
		while(temp != null) {
			System.out.print(temp.value+" ");
			temp = temp.next;
		}
	}
}

public class LinkedList {

	public static void main(String[] args) {

		LearnLinkedList list = new LearnLinkedList();
//		list.addFirst(10);
//		list.addFirst(20);
//		list.addLast(40);
//		list.addFirst(30);
//		list.addLast(60);
//		list.addFirst(70);
//		list.addFirst(80);
//		list.addLast(90);
//		list.addLast(100);
//		list.addFirst(50);
//		System.out.println(list.isValue(40));
//		System.out.println(list.isIndexOf(0));
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		list.printLinkList();
	}
}
