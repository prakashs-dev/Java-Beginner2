package com.Node;

class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class takeUforword {
	static ListNode head;

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		ListNode head = convertArr2LL(a);
		printLL(head);
//		head = removeHead(head);
//		head = removeTail(head);
//		int k = 3;
//		head = removeKthElement(head,k);
		int data = 4;
		head = removeValEle(head, data);
		printLL(head);
	}

	private static ListNode removeValEle(ListNode head, int data) {
		if (head == null)
			return head;
		if (head.val == data) {
			ListNode temp = head;
			head = head.next;
			return head;
		}
		ListNode temp = head, prev = null;
		while (temp != null) {
			if(temp.val == data) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	private static ListNode removeKthElement(ListNode head, int k) {
		if (head == null)
			return head;
		if (k == 1) {
			ListNode temp = head;
			head = head.next;
			return head;
		}
		int count = 0;
		ListNode temp = head, prev = null;
		while (temp != null) {
			count++;
			if (count == k) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		return head;
	}

	private static ListNode removeTail(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}
		ListNode temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		return head;
	}

	private static ListNode removeHead(ListNode head) {
		if (head == null)
			return head;
		head = head.next;
		return head;
	}

	private static int SumOfLL(ListNode head) {
		int sum = 0;
		while (head != null) {
			sum += head.val;
			head = head.next;
		}
		return sum;
	}

	private static void printLL(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	private static ListNode convertArr2LL(int[] a) {
		for (int i = 0; i < a.length; i++) {
			ListNode newNode = new ListNode(a[i]);
			if (head == null) {
				head = newNode;
			} else {
				newNode.next = head;
				head = newNode;
			}
		}
		return head;
	}

}
