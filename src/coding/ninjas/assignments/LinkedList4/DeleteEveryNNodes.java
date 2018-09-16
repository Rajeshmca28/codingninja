package LinkedList4;
/*Given a linked list and two integers M and N. Traverse the linked list such that you retain M nodes then delete next N nodes, continue the same until end of the linked list. That is, in the given linked list you need to delete N nodes after every M nodes.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : M
Line 3 : N
*/

public class DeleteEveryNNodes {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {

		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> prev = null;

		while (curr != null) {
			int i = 0, j = 0;

			while (i < M && curr != null) {
				prev = curr;
				curr = curr.next;

				i++;
			}

			while (j < N && curr != null) {
				if (curr.next == null) {
					prev.next = null;
				}
				if (curr.next != null) {
					curr.data = curr.next.data;
					curr.next = curr.next.next;
				}
				j++;
			}
		}
		return head;
	}
}
