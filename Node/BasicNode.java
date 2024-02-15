package com.Node;

import java.util.ArrayList;
import java.util.Collections;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkList {
	Node head;

	void printLinkedList() {
		Node curr = this.head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}

	void addList(int num) {
		Node temp = new Node(num);
		if (head == null) {
			head = temp;
		} else {
			Node curr = head;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = temp;
		}
	}

	void addIndexed(int idx, int ele)throws IndexOutOfBoundsException {
		try {
			Node temp = new Node(ele);
			int count = 0;
			Node curr = this.head;
			while (count < idx - 1) {
				curr = curr.next;
				count++;
			}
			temp.next = curr.next;
			curr.next = temp;
		} catch (NullPointerException e) {
			throw new IndexOutOfBoundsException();
		}
	}

	public void reverseLinkdList() {

		Node temp = this.head;
		ArrayList<Integer> al = new ArrayList<>();
		while (temp != null) {
			al.add(temp.data);
			temp = temp.next;
		}
		Collections.sort(al);
		int i = 0; temp = this.head;
		while(temp != null) {
			temp.data = al.get(i++);
			temp = temp.next;
		}
//		tc: n + n log n + n
//		sc: o(n)
	}

	public void oddEvenList(Node head) {
		Node odd = head, even = head.next, evenHead = even;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        printLinkedList();
	}

	public static Node deleteNthNodeEndList(Node head, int n) {
		// TODO Auto-generated method stub
		Node fast = head;
		Node slow = head;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		if(fast == null) {
			return head;
		}
		Node delNode = slow.next;
		slow.next = slow.next.next;
		return head;
	}

	public Node removeKNode(Node head, int i) {
		if (head == null ) {
			return head;
		}
		if(i == 1) {
			head = head.next;
			return head;
		}
		int count = 1; Node temp = head, prev = null;
		while (temp != null) {
			count++;
			if(count == i) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}
}

public class BasicNode {

	public static void main(String[] args) {

		LinkList linkList = new LinkList();
//		creating basic node
		linkList.addList(1);	// 0
		linkList.addList(2);	// 1
		linkList.addList(3);	// 2
		linkList.addList(4);	// 3
		linkList.addList(5);
//		linkList.addIndexed(8, 25);
//		linkList.printLinkedList();
//		System.err.print("Reversed LinkedList :: ");
//		linkList.reverseLinkdList();
//		linkList.printLinkedList();
//		linkList.oddEvenList(linkList.head);
//		Node ans = linkList.deleteNthNodeEndList(linkList.head, 2);
//		System.out.println();
//		linkList.printLinkedList();
		Node head = linkList.removeKNode(linkList.head, 4);
//		linkList.printLinkedList();
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

}
