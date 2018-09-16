package LinkedList2;

/*Given a linked list, reverse it using recursion.
You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)`

*/
public class ReverseLinkedListRecursive {
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		if (head == null) {
			return null;
		}
		if (head.next == null) {
			return head;
		}
		LinkedListNode<Integer> node = head.next;

		head.next = null;

		LinkedListNode<Integer> temp = reverse_R(node);

		node.next = head;

		return temp;
	}
}
