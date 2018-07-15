package com.coding.ninja.linked.list;

import java.util.Scanner;

public class LinkList {
	Node<Integer> head = null, tail = null;

	class Node<T> {
		T data;

		Node<T> next;

		public Node(T data) {
			this.data = data;
		}

		public Node() {

		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}

	public void addLast(int data) {
		Node<Integer> node = new Node<Integer>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}

	/*
	 * public Node<Integer> addIthPos(Node<Integer> head, int data, int pos) {
	 * Node<Integer> node = new Node<Integer>(data); Node<Integer> temp1 = head; int
	 * c = size(); if (pos == 0) { node.next = head; head = node;
	 * 
	 * } else { for (int i = 0; i <= c - 1; i++) { if (i == pos - 1) { node.next =
	 * temp1.next; temp1.next = node; } temp1 = temp1.next;
	 * 
	 * } } this.head = head; return head; }
	 */ // 3 4 5 2 6 1 9 -1

	public int size() {
		Node<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public void print() {

		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;

		if (head == null) {
			return null;
		}
		while (temp.next != null) {

			if (temp.data.equals(temp.next.data)) {
				temp1 = temp.next.next;
				temp.next = null;
				temp.next = temp1;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	public Node<Integer> removeIthPos(Node<Integer> head, int pos) {

		Node<Integer> temp1 = head;
		// Node<Integer> removed = null;
		if (head == null) {
			return null;
		}
		int c = size();
		if (pos == 0) {
			// removed = head;
			head = head.next;
		} else {
			for (int i = 0; i <= c - pos; i++) {
				if (i == pos - 1) {
					// removed = temp1.next;
					temp1.next = temp1.next.next;
				} else {
					temp1 = temp1.next;
				}
			}
		}
		return temp1;// removed;
	}

	public Node<Integer> append(Node<Integer> head, int n) {
		Node<Integer> t1 = head;
		Node<Integer> t = head;

		int c = size();
		int i = 0;
		if (c < n) {
			return null;

		} else {
			while (i < c - n - 1) {
				t1 = t1.next;
				i++;
			}
			head = t1.next;
			Node<Integer> t3 = head;
			Node<Integer> t4 = head;
			t1.next = null;

			while (t3.next != null) {
				t3 = t3.next;
			}
			t3.next = t;
			this.head = t4;
			return head;
		}

	}

	private void swap(Node<Integer> nodeL, Node<Integer> nodeR) {
		Node<Integer> temp = nodeL;
		nodeL = nodeR;
		nodeR = temp;
	}

	public Node<Integer> bubbleSort(Node<Integer> head) {
		Node<Integer> node = head;
		//Node<Integer> current = head;
		int c = size();
		for (int i = 0; i < c - 1; i++) {
			int cnt = 0;
			while (node != null) {
				if (node.next != null && (node.data) > (node.next.data)) {
					Node<Integer> temp = node;
					node = node.next;
					temp.next = node.next;
					node.next = temp;
					if (cnt == 0) {
						this.head = node;
					} else {
						Node<Integer> t =this.head;
						while(t.next != null) {
							t = t.next;
						}
						t.next = node;
					}
				}
				cnt++;
				node = node.next;
			}
			node = this.head;
		}

		return this.head;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value in List");
		int data = s.nextInt();

		LinkList ll = new LinkList();
		while (data != -1) {
			ll.addLast(data);

			data = s.nextInt();
		}
		// System.out.println("enter pos to add");
		// int pos = s.nextInt();
		// System.out.println("enter data to add");
		// Node removed = ll.removeIthPos(ll.head, pos);
		// System.out.println("Removed : " + removed);
		// ll.addIthPos(ll.head, s.nextInt(), pos);
		// ll.append(ll.head, pos);
		// ll.removeDuplicates(ll.head);
		ll.bubbleSort(ll.head);
		ll.print();
		s.close();

	}
}
