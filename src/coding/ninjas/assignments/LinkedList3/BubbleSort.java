package LinkedList3;

/*Sort a given linked list using Bubble Sort (iteratively). While sorting, you need to swap the entire nodes, not just the data.
You don't need to print the elements, just sort the elements and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)`

*/
public class BubbleSort {
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> node = head;
		int len = size(head);

		for (int i = 0; i < len - 1; i++) {
			int count = 0;
			int c = 0;
			while (node != null) {
				if (node.next != null && (node.data) > (node.next.data)) {
					LinkedListNode<Integer> temp = node;
					node = node.next;
					temp.next = node.next;
					node.next = temp;
					c++;
					if (count == 0) {
						head = node;
					} else {
						LinkedListNode<Integer> t = head;
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
