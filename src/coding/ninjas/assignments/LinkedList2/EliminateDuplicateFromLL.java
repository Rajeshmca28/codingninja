package LinkedList2;

/*Given a sorted linked list (elements are sorted in ascending order). Eliminate duplicates from the given LL, such that output LL contains only unique elements.
You don't need to print the elements, just remove duplicates and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)

*/
public class EliminateDuplicateFromLL {
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> node = head;

		LinkedListNode<Integer> temp = head;

		if (head == null) {
			return null;
		}
		while (node.next != null) {

			if ((node.data).equals(node.next.data)) {
				temp = node.next.next;
				node.next = null;
				node.next = temp;
			} else {
				node = node.next;
			}
		}
		return head;
	}

}
