package LinkedList4;

/*Implement kReverse( int k ) in a linked list i.e. you need to reverse first K elements then reverse next k elements and join the linked list and so on.
Indexing starts from 0. If less than k elements left in the last, you need to reverse them as well. If k is greater than length of LL, reverse the complete LL.
You don't need to print the elements, just return the head of updated LL.
Input format :

Line 1 : Linked list elements (separated by space and terminated by -1)

Line 2 : k

*/
public class KReverse {
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {

		LinkedListNode<Integer> prev = null;
		LinkedListNode<Integer> curr = head;
		LinkedListNode<Integer> fwd = null;
		int t = k;
		while (curr != null && t > 0) {
			t--;
			fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;

		}
		if (curr != null) {
			head.next = kReverse(curr, k);
		}
		return prev;

	}

}
