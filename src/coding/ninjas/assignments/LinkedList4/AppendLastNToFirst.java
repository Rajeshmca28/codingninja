package LinkedList4;
/*Given a linked list and an integer n, append the last n elements of the LL to front.
Indexing starts from 0. You don't need to print the elements, just update the elements and return the head of updated LL.
Assume given n will be smaller than length of LL.
Input format :

Line 1 : Linked list elements (separated by space and terminated by -1)`

*/

class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}

public class AppendLastNToFirst {
	public static LinkedListNode<Integer> append(LinkedListNode<Integer> root, int n) {

		LinkedListNode<Integer> t1 = root;
		LinkedListNode<Integer> t = root;

		int c = size(root);
		int i = 0;
		if (c < n) {
			return null;

		} else {
			while (i < c - n - 1) {
				t1 = t1.next;
				i++;
			}
			root = t1.next;
			LinkedListNode<Integer> t3 = root;
			LinkedListNode<Integer> t4 = root;
			t1.next = null;

			while (t3.next != null) {
				t3 = t3.next;
			}
			t3.next = t;
			root = t4;
			return root;
		}
	}

	public static int size(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

}
