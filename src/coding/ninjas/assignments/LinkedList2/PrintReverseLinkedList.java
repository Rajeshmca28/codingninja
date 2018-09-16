package LinkedList2;

/*Print a given linked list in reverse order. You need to print the tail first and head last. You can’t change any pointer in the linked list, just print it in reverse order.
Input format : Linked List elements (separated by space and terminated by -1)

Output format : Linked List elements in reverse order (separated by space)

*/
public class PrintReverseLinkedList {
	public static void printReverseRecursive(LinkedListNode<Integer> root) {

		LinkedListNode<Integer> temp = root;
		if (temp == null) {
			return;
		}
		printReverseRecursive(temp.next);
		System.out.print(temp.data + " ");
	}

}
