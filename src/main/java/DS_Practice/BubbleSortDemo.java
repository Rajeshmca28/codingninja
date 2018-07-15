package DS_Practice;


public class BubbleSortDemo {
	Node<Integer> head = null, tail = null;

	class Node<T> {
		T data;

		Node<T> next;

		public Node(T data) {
			this.data = data;
		}

		public Node() {

		}

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}

	public static Node<Integer> bubbleSort(Node<Integer> head )
	{
	Node<Integer> node=head;
      Node<Integer> temp=null;
      int len=size(head);
for(int i=0;i<len-1;i++){
  for(int j=0;j<len-i-1;j++){
    if((node.data)>(node.next.data)){
      temp=node;
      node=node.next;
      node.next=temp;
    }
  }
}
      return head;
    
    }
  
public static  int size(Node<Integer> head) {
	Node<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}



}
