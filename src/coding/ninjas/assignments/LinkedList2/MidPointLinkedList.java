package LinkedList2;

/*Given a linked list, find and return the midpoint.
If the length of linked list is even, return the first mid point.
Input format : Linked list elements (separated by space and terminated by -1)`

*/
public class MidPointLinkedList {
	public static int printMiddel(LinkedListNode<Integer> head) {
		{
			int size = size(head);
			if (head == null) {
				return -1;
			}
			int mid = 0;
			if (size % 2 == 0) {
				mid = (size / 2);
			} else {
				mid = (size / 2) + 1;
			}
			LinkedListNode<Integer> t = head;
			for (int i = 1; i < mid; i++) {
				t = t.next;
			}
			return t.data;
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
