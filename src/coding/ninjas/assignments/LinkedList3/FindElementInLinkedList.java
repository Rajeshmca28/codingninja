package LinkedList3;

/*Given a linked list and an integer n you need to find and return index where n is present in the LL. Do this iteratively.
Return -1 if n is not present in the LL.
Indexing of nodes starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n 
Output format :
Index
*/class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

/*	public Node(T data) {
		this.data = data;
	}
*/}

public class FindElementInLinkedList {
	public static int indexOfNIter(LinkedListNode<Integer> head, int n) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		LinkedListNode<Integer> current = head;
		int count = 0;
		while (current != null) {
			if (current.data == n) {
				return count;

			}
			count++;

			current = current.next;
		}
		return -1;
	}

}
