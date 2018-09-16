package LinkedList1;

/*Given a linked list and a position i, print the node at ith position.
If position i is greater than length of LL, then don't print anything.
Indexing starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer i (position)
Output format :
Element at ith position
*/
public class PrintIthNode {
	public static void printIth(LinkedListNode<Integer> head, int i) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Print output and don't return it. Taking
		 * input is handled automatically.
		 */
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp1 = temp;

		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		if (count == 0 && i > count) {
			return;
		}
		int j = 0;
		for (; j < i && temp1.next != null; j++) {
			temp1 = temp1.next;

		}
		if (j == i && temp1 != null) {
			System.out.print(temp1.data);
		}
	}
}
