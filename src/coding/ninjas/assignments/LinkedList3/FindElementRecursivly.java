package LinkedList3;
/*Given a linked list and an integer n you need to find and return index where n is present in the LL. Do this recursively.
Return -1 if n is not present in the LL.
Indexing of nodes starts from 0.
Input format :
Line 1 : Linked list elements (separated by space and terminated by -1)
Line 2 : Integer n*/

public class FindElementRecursivly {
	static boolean notMatched = false;

	public static int indexOfNRec(LinkedListNode<Integer> head, int n) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */

		if (head == null) {
			notMatched = true;
			return -1;
		}
		if (head.data == n) {
			return 0;
		}
		int count = 1;
		int res = count + indexOfNRec(head.next, n);
		if (notMatched) {
			return -1;
		}

		return res;

	}
}
