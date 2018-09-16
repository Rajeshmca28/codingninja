package LinkedList3;

/*Sort a given linked list using Merge Sort.
You don't need to print the elements, just sort the elements and return the head of updated LL.
Input format :
Linked list elements (separated by space and terminated by -1)
Output format :
Updated LL elements (separated by space)
*/
public class MergeSort {
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here

		if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer> mid = mid(head);
		LinkedListNode<Integer> midNext = mid.next;

		mid.next = null;

		LinkedListNode<Integer> left = mergeSort(head);

		LinkedListNode<Integer> right = mergeSort(midNext);

		LinkedListNode<Integer> sortlist = merge(left, right);
		return sortlist;

	}

	public static LinkedListNode<Integer> merge(LinkedListNode<Integer> t1, LinkedListNode<Integer> t2) {
		LinkedListNode<Integer> temp = null;
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;

		if (t1.data <= t2.data) {
			temp = t1;
			temp.next = merge(t1.next, t2);
		} else {
			temp = t2;
			temp.next = merge(t1, t2.next);
		}
		return temp;

	}

	public static LinkedListNode<Integer> mid(LinkedListNode<Integer> head) {
		if (head == null)
			return head;
		LinkedListNode<Integer> node = head.next;
		LinkedListNode<Integer> temp = head;

		while (node != null) {
			node = node.next;
			if (node != null) {
				temp = temp.next;
				node = node.next;
			}
		}
		return temp;
	}

}
