package LinkedList2;

/*Check if a given linked list is palindrome or not. Return true or false.
Indexing starts from 0.
Input format : Linked list elements (separated by space and terminated by -1)`

*/
public class PalindromLinkedList {

	public static boolean isPalindrome_2(LinkedListNode<Integer> head) {

		if (head == null)
			return true;
		LinkedListNode<Integer> node = head;

		LinkedListNode<Integer> node1 = new LinkedListNode<Integer>(head.data);

		while (node.next != null) {
			LinkedListNode<Integer> temp = new LinkedListNode<Integer>(node.next.data);
			temp.next = node1;
			node1 = temp;
			node = node.next;
		}
		LinkedListNode<Integer> t1 = head;
		LinkedListNode<Integer> t2 = node1;
		while (t1 != null) {
			if (t1.data != t2.data)
				return false;
			t1 = t1.next;
			t2 = t2.next;
		}
		return true;
	}
}
