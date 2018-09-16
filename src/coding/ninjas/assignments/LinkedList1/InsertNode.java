package LinkedList1;

/*Given a linked list, an integer n and a position i, insert that node n into Linked List at ith position.
If position i is greater than length of LL, you should return the same LL without any change.
Indexing starts from 0. You don't need to print the elements, just insert and return the head of updated LL.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Line 3 : Integer n (Node to be inserted)
*/class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

public class InsertNode {
	public static Node<Integer> insert(Node<Integer> head, int data, int pos) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		Node<Integer> node = new Node<Integer>(data);
		Node<Integer> temp = head;
		if (pos == 0) {
			node.next = head;
			return node;
		}
		while (head != null && pos > 1) {
			pos--;
			temp = temp.next;

		}
		node.next = temp.next;
		temp.next = node;
		return head;
	}
}
