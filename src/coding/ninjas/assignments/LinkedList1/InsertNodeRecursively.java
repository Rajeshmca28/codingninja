package LinkedList1;

/*Given a linked list, an integer n and a position i, Insert that node n into Linked List at ith position recursively.
If position i is greater than length of LL, then you should return the same LL without any change. And if position i is equal to length of input LL, insert the node at last position.
Indexing starts from 0. You don't need to print the elements, just insert and return the head of updated LL.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Line 3 : Integer n (Node to be inserted)
Output format :
Updated LL elements (separated by space)
*/
public class InsertNodeRecursively {

	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos) {
		if (head == null) {
			return head;
		}
		if (pos == 0) {
			LinkedListNode<Integer> node = new LinkedListNode<Integer>(data);
			node.next = head;
			return node;
		}
		if (pos == 1) {
			LinkedListNode<Integer> node = new LinkedListNode<Integer>(data);
			node.next = head.next;
			head.next = node;
			return head;
		}
		head.next = insertR(head.next, data, pos - 1);
		return head;
	}

}
