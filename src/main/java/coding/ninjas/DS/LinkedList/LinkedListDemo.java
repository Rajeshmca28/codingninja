package coding.ninjas.DS.LinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	public Node(int d) {
		data = d;
	}

}

public class LinkedListDemo {
	public static Node prepareLinkedList() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data into Link list");
		int data = s.nextInt();
		Node head = null;
		Node tail = null;
		while (data != -1) {
			Node node = new Node(data);

			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = tail.next;

			}
			data = s.nextInt();
		}
		return head;

	}

	public static void print(Node head) {
		Node temp = head;
		
		  while(temp!=null) { 
			  System.out.println(temp.data);
			  temp=temp.next;
		  }
	}
	public static void revPrint(Node head) {
		Node temp=head;
		if (temp == null) {
			return;
		}
		revPrint(temp.next);
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		Node head = prepareLinkedList();
		//print(head);
		revPrint(head);
	}

}