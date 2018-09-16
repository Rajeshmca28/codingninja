package com.coding.ninja.linked.list;

import java.util.Scanner;

public class LinkList1 {
	Node head = null, tail = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}

	public Node find(int pos) {
		int c = 0;
		Node temp = head;
		Node temp1 = head;
		while (temp != null) {
			temp = temp.next;
			c++;

		}
		if (pos > c) {
			System.out.println(" pos is out of range");
			return null;
		}
		for (int i = 0; i <= c; i++) {
			if (i == pos) {
				return temp1;
			}
			temp1 = temp1.next;
		}

		return null;

	}

	public void addFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	public int size() {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public void removeFirst() {
		Node temp = head;
		if (temp == null) {
			return;
		}
		head = head.next;
	}

	
	
	
	
	
	public Node rearrangeEvenOdd(Node head)
	{
	    if (head == null)
	        return null;
	 
	    Node odd = head;
	    Node even = head.next;
	 
	    Node evenFirst = even;
	 
	    while (head!=null)
	    {
	      /*  if (!odd || !even || !(even.next))
	        {
	            odd.next = evenFirst;
	            break;
	        }
	      */  odd.next = even.next;
	        odd = even.next;
	 
	        if (odd.next == null)
	        {
	            even.next = null;
	            odd.next = evenFirst;
	            break;
	        }
	 
	        even.next = odd.next;
	        even = odd.next;
	    }
	 
	    return head;
	}
	public void removeLast() {
		Node temp = head;
		if (head == null) {
			return;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

	}

	
	public void addMid(int data, int pos) {
		Node node = new Node(data);
		Node temp1 = head;
		int c = size();
		if (pos == c) {
			System.out.println(" pos can not be last as we have to add in middle");
			return;
		} else if (pos > c) {
			System.out.println(" pos is out of range");
			return;
		}
		for (int i = 0; i <= c; i++) {
			if (i == pos) {
				node.next = temp1.next;
				temp1.next = node;
			}
			temp1 = temp1.next;

		}
	}

	public void print() {

		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value in List");
		int data = s.nextInt();
		LinkList1 ll = new LinkList1();
		while (data != -1) {
			ll.addLast(data);
			// ll.addFirst(data);

			data = s.nextInt();
		}
		/*
		 * System.out.println("Enter mid pos and data:"); int pos = s.nextInt(); data =
		 * s.nextInt();
		 */
		// ll.addMid(data, pos);
		ll.removeLast();
		ll.rearrangeEvenOdd(ll.head);
		ll.print();
		s.close();
	}
}
