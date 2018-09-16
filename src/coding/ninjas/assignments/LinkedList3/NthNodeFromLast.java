package LinkedList3;

/*Given a linked list and an integer n you need to find and return the nth node from last without calculating length of input linked list.
Return null if length of LL is smaller than n.
Counting of nodes starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n 
Output format :
nth node from last
*/
public class NthNodeFromLast {
	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */

		LinkedListNode<Integer> f = head;
		LinkedListNode<Integer> c = head;

		for (int i = 0; i < n && f.next != null; i++) {
			f = f.next;

		}

		if (f.next == null) {
			return f.next;
		}
		while (f.next != null) {
			f = f.next;
			c = c.next;
		}

		return c;
	}

}
