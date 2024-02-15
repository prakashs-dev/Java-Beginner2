package com.assignment;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {
	Node head;

	LinkedList() {
		this.head = null;
	}

	public int size = 0;

	public boolean isEmpty() {
		return head == null ? true : false;
	}

	public void insert(int data) {
		Node num = new Node(data);
		if (isEmpty()) {
			head = num;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = num;
		}
	}

	public void printReverseLinkedList(Node node) {
		if (node == null) {
			return;
		}
		printReverseLinkedList(node.next);
		System.out.print(node.data + " ");
	}

	public void printLinkedList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
}

public class Solutions {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.insert(10);
		myList.insert(20);
		myList.insert(30);
		myList.insert(40);
		myList.insert(50);

		System.out.println("Original Linked List:");
		myList.printLinkedList();

		System.out.println("Reversed Linked List:");
		myList.printReverseLinkedList(myList.head);
	}
}
