package LinkedList1;

/*Given two linked lists sorted in increasing order. Merge them in such a way that the result list is also sorted (in increasing order).
Try solving with O(1) auxiliary space (in-place). You just need to return the head of new linked list, don't print the elements.
Input format :
Line 1 : Linked list 1 elements of length n (separated by space and terminated by -1)
Line 2 : Linked list 2 elements of length m (separated by space and terminated by -1)
Output format :
Merged list elements (separated by space)
*/
public class MergeTwoSortedLinkedList {
	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		LinkedListNode<Integer> temp = new LinkedListNode<>(0);
		LinkedListNode<Integer> last = temp;

		while (head1 != null && head2 != null) {

			if (head1.data < head2.data) {
				temp.next = head1;
				head1 = head1.next;
			} else {
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
		}
		temp.next = (head1 == null) ? head2 : head1;
		return last.next;

}
}