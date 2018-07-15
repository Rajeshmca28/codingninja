package DS_Practice;

import java.util.Scanner;

public class LinkList {
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

	public void addMid(int data, int pos) {
		Node node = new Node(data);
		Node temp = head;
		Node temp1 = head;
		int c = 0;
		while (temp != null) {
			temp = temp.next;
			c++;

		}
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

	public static void print(Node node) {

		Node temp = node;

		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value in List");
		int data = s.nextInt();
		LinkList ll = new LinkList();
		while (data != -1) {
			ll.addLast(data);
			// ll.addFirst(data);

			data = s.nextInt();
		}
		System.out.println("Enter mid pos and data:");
		int pos = s.nextInt();
		data = s.nextInt();
		ll.addMid(data, pos);
		print(ll.head);
		s.close();
	}
}
