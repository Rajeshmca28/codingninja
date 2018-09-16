package LinkedList2;
/*Given a linked list, reverse it iteratively.
You don't need to print the elements, just reverse the LL duplicates and return the head of updated LL.
Input format : Linked list elements (separated by space and terminated by -1)`

*/
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
public class ReverseLinkedListItretive {
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
	     
        LinkedListNode<Integer> node = head;
		  LinkedListNode<Integer> tail = null;
        LinkedListNode<Integer> temp = null;
  while (node != null) {
      temp = node.next;
      node.next = tail;
      tail = node;
      node = temp;
  }
  return tail;
}


}
