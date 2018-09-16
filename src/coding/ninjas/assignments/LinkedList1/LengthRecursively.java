package LinkedList1;

/*Given a linked list, find and return the length of input LL recursively.
Input format :
Linked list elements (separated by space and terminated by -1)
Output format :
Length of LL
*/
public class LengthRecursively {

	public static int length(LinkedListNode<Integer> head) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		LinkedListNode<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

}
