package LinkedList2;

/*Given a linked list, i & j, swap the nodes that are present at i & j position in the LL. You need to swap the entire nodes, not just the data.
Indexing starts from 0. You don't need to print the elements, just swap and return the head of updated LL.
Assume i & j given will be within limits. And i can be greater than j also.
Input format :

Line 1 : Linked list elements (separated by space and terminated by -1)

Line 2 : i and j (separated by space)

*/
public class SwapTwoNodeOfLinkedList {
	public static LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head, int i, int j) {

		LinkedListNode<Integer> node1 = head;
		for (int x = 0; x < i; x++) {
			node1 = node1.next;
		}

		LinkedListNode<Integer> node2 = head;
		for (int y = 0; y < j; y++) {
			node2 = node2.next;
		}

		int tdata = node1.data;
		node1.data = node2.data;
		node2.data = tdata;
		return head;
	}

}
