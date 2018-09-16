package LinkedList4;

/*Arrange elements in a given Linked List such that, all even numbers are placed after odd numbers. Respective order of elements should remain same.
You don't need to print the elements, instead return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)`

*/
public class EvenAfterOddLinkedList {
	public static LinkedListNode<Integer> sortEvenOdd(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> evenHead = null, evenTail = null;
		LinkedListNode<Integer> oddHead = null, oddTail = null;

		while (head != null) {

			if (head.data % 2 != 0) {
				if (oddHead == null && oddTail == null) {
					oddHead = head;
					oddTail = head;
				} else {
					oddTail.next = head;
					oddTail = head;
				}
			} else {
				if (evenHead == null && evenTail == null) {
					evenHead = head;
					evenTail = head;
				} else {
					evenTail.next = head;
					evenTail = head;
				}
			}
			head = head.next;
		}
		if (evenTail != null) {
			evenTail.next = null;
		}
		if (oddTail != null) {
			oddTail.next = null;
		}
		if (oddHead != null) {
			oddTail.next = evenHead;
			return oddHead;
		}
		return evenHead;
	}

}
