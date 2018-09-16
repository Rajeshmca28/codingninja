package LinkedList4;

class ListNode<t> {
	public t data;
	public ListNode<t> next;

	public ListNode(t data) {
		this.data = data;
	}
}

/*
 * Given a singly linked list L : L0→L1→…→Ln-1→Ln . Rearrange the nodes in the
 * list so that the new formed list is : L0→Ln→L1→Ln-1→L2→Ln-2→… You are
 * required do this in-place without altering the nodes' values. You just need
 * to return the head of new linked list, don't print the elements. Input format
 * : Line 1 : Linked list elements of length n (separated by space and
 * terminated by -1) Output format : Updated list elements (separated by space)
 */
public class ReArrangeLinkedList {
	public static ListNode<Integer> changelist(ListNode<Integer> head) {
		// Write your code here
		return result(head);
	}

	public static ListNode<Integer> midNode(ListNode<Integer> head) {
		ListNode<Integer> node = head;
		ListNode<Integer> temp = head.next;
		int count = 0;
		while (temp != null && temp.next != null) {
			node = node.next;
			temp = temp.next.next;
			count++;

		}
		return node;
	}

	public static ListNode<Integer> revList(ListNode<Integer> head) {
		ListNode<Integer> curr = head;
		ListNode<Integer> prev = null;

		while (curr != null) {
			ListNode<Integer> fwd = curr.next;
			curr.next = prev;
			prev = curr;
			curr = fwd;
		}
		return prev;
	}

	static ListNode<Integer> result(ListNode<Integer> head) {
		ListNode<Integer> mid = midNode(head);
		ListNode<Integer> head2 = mid.next;
		mid.next = null;
		head2 = revList(head2);
		addNode(head, head2);
		return head;

	}

	static ListNode<Integer> addNode(ListNode<Integer> head1, ListNode<Integer> head2) {
		ListNode<Integer> head = head1;
		ListNode<Integer> tail = head1;
		head1 = head1.next;
		boolean b = true;
		while (head1 != null && head2 != null) {
			if (b) {
				tail.next = head2;
				head2 = head2.next;
			} else {
				tail.next = head1;
				head1 = head1.next;
			}
			b = !b;
			tail = tail.next;
		}
		if (head1 != null) {
			tail.next = head1;
			head1 = head1.next;
		}
		if (head2 != null) {
			tail.next = head2;
			head2 = head2.next;
		}
		return head;
	}

}
