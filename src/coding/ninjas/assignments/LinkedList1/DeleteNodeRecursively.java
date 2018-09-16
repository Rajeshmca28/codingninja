package LinkedList1;

/*Given a linked list and a position i, delete the node of ith position from Linked List recursively.
If position i is greater than length of LL, then you should return the same LL without any change.
Indexing starts from 0. You don't need to print the elements, just delete the node and return the head of updated LL.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Output format :
Updated LL elements (separated by space)
*/
public class DeleteNodeRecursively {
	public static LinkedListNode<Integer> deleteIthNodeRec(LinkedListNode<Integer> head, int i) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		return removeIthPos(head, i);
	}

	public static LinkedListNode<Integer> removeIthPos(LinkedListNode<Integer> head, int pos) {

		LinkedListNode<Integer> temp1 = head;
		if (head == null) {
			return null;
		}
		int c = size(head);
		if (pos == 0) {
			head = head.next;
		} else {
			for (int i = 0; i <= c - pos; i++) {
				if (i == pos - 1) {
					temp1.next = temp1.next.next;
				} else {
					temp1 = temp1.next;
				}
			}
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
