package MixProblem;

/*Given a Linked List, which has nodes in alternating ascending and descending orders. Sort the list efficiently and space complexity should be O(1).
You just need to return the head of sorted linked list, don't print the elements.
Input format :
Line 1 : Linked list elements of length L (separated by space and terminated by -1)
Line 2 : Integer n
Output format :
Updated list elements (separated by space)
*/class Node<T> {
	public T data;
	public Node<T> next;

	public Node(T data) {
		this.data = data;
		this.next = null;
	}
}

public class SortLinkedList {
	public static Node<Integer> sort(Node<Integer> head) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		Node<Integer> node = head;
		int len = size(head);

		for (int i = 0; i < len - 1; i++) {
			int count = 0;
			int c = 0;
			while (node != null) {
				if (node.next != null && (node.data) > (node.next.data)) {
					Node<Integer> temp = node;
					node = node.next;
					temp.next = node.next;
					node.next = temp;
					c++;
					if (count == 0) {
						head = node;
					} else {
						Node<Integer> t = head;
						for (int j = 1; j < c - 1; j++) {
							if (j > 0) {
							}
							t = t.next;
						}
						t.next = node;

					}
				} else {
					c++;
				}
				count++;
				node = node.next;
			}
			node = head;
		}

		return head;
	}

	public static int size(Node<Integer> head) {
		Node<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
}
