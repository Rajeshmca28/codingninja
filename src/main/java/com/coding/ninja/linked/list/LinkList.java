package com.coding.ninja.linked.list;

import java.util.Scanner;

import com.coding.ninja.linked.list.LinkList1.Node;

public class LinkList {
	Node<Integer> head = null, tail = null;
	Node<Integer> result = null;

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

	public void addLast(int data) {
		Node<Integer> node = new Node<Integer>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = tail.next;
		}
	}
	

	/*
	 * public Node<Integer> addIthPos(Node<Integer> head, int data, int pos) {
	 * Node<Integer> node = new Node<Integer>(data); Node<Integer> temp1 = head; int
	 * c = size(); if (pos == 0) { node.next = head; head = node;
	 * 
	 * } else { for (int i = 0; i <= c - 1; i++) { if (i == pos - 1) { node.next =
	 * temp1.next; temp1.next = node; } temp1 = temp1.next;
	 * 
	 * } } this.head = head; return head; }
	 */ // 3 4 5 2 6 1 9 -1

	public int size() {
		Node<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public int size(Node<Integer> head) {
		Node<Integer> temp = head;
		int size = 0;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public void print() {

		Node<Integer> temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public void print(Node h) {

		Node temp = h;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public Node<Integer> removeDuplicates(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;

		if (head == null) {
			return null;
		}
		while (temp.next != null) {

			if (temp.data.equals(temp.next.data)) {
				temp1 = temp.next.next;
				temp.next = null;
				temp.next = temp1;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

	public Node<Integer> removeIthPos(Node<Integer> head, int pos) {

		Node<Integer> temp1 = head;
		// Node<Integer> removed = null;
		if (head == null) {
			return null;
		}
		int c = size();
		if (pos == 0) {
			// removed = head;
			head = head.next;
		} else {
			for (int i = 0; i <= c - pos; i++) {
				if (i == pos - 1) {
					// removed = temp1.next;
					temp1.next = temp1.next.next;
				} else {
					temp1 = temp1.next;
				}
			}
		}
		return temp1;// removed;
	}

	public Node<Integer> append(Node<Integer> head, int n) {
		Node<Integer> t1 = head;
		Node<Integer> t = head;

		int c = size();
		int i = 0;
		if (c < n) {
			return null;

		} else {
			while (i < c - n - 1) {
				t1 = t1.next;
				i++;
			}
			head = t1.next;
			Node<Integer> t3 = head;
			Node<Integer> t4 = head;
			t1.next = null;

			while (t3.next != null) {
				t3 = t3.next;
			}
			t3.next = t;
			this.head = t4;
			return head;
		}

	}

	public Node<Integer> bubbleSort(Node<Integer> head) {
		Node<Integer> node = head;
		int c = size();
		for (int i = 0; i < c - 1; i++) {
			int cnt = 0;
			int changeCnt = 0;
			while (node != null) {
				if (node.next != null && (node.data) > (node.next.data)) {
					Node<Integer> temp = node;
					node = node.next;
					temp.next = node.next;
					node.next = temp;
					changeCnt++;
					if (cnt == 0) {
						this.head = node;
					} else {
						Node<Integer> t = this.head;
						System.out.print("\n head data : " + " ");
						for (int j = 1; j < changeCnt - 1; j++) {
							if (j > 0) {
								System.out.print("" + t.data + " ");
							}
							t = t.next;
						}
						System.out.println(t.data);
						System.out.println("\n remaining ");
						print(node);
						t.next = node;
						System.out.println("\n updated list: ");
						print(this.head);
					}
				} else {
					changeCnt++;
				}
				cnt++;

				node = node.next;
			}
			node = this.head;
		}

		return this.head;

	}

	public int printMiddel(Node<Integer> head) {
		{
			int size = size();
			if (head == null) {
				return -1;
			}
			int mid = 0;
			if (size % 2 == 0) {
				mid = (size / 2);
			} else {
				mid = (size / 2) + 1;
			}
			Node<Integer> t = head;
			for (int i = 1; i < mid; i++) {
				t = t.next;
			}

			// System.out.println(t.data);
			return t.data;
		}
	}

	public Node<Integer> swap_nodes(Node<Integer> head, int i, int j) {

		Node<Integer> node1 = head;
		for (int x = 0; x < i; x++) {
			node1 = node1.next;
		}

		Node<Integer> node2 = head;
		for (int y = 0; y < j; y++) {
			node2 = node2.next;
		}

		int data = node1.data;
		node1.data = node2.data;
		node2.data = data;
		return head;
	}
public void createCircular(int data) {
	  Node<Integer> node = new Node<Integer>(data);
	  int size=size();
	  if(size==0){
	   head = node;
	    tail = node;
	   node.next = head;
	  }else{
	   Node<Integer> temp = head;
	   node.next = temp;
	   head = node;
	   tail.next = head;
	  }
	  size++;
	}


	public void addFirst(int data) {
		Node<Integer> node = new Node<Integer>(data);
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
	}
	public void checkCircular(Node<Integer> head)
	{
		Node<Integer> sf=head;
		Node<Integer> ff=head;
	while(head!=null){
	sf=sf.next;
	ff=ff.next.next;
	if(sf==ff){
	System.out.println("circulr Link List");
	}
System.out.println("Not a circular Link list");
return;
	}
	
	}
	public Node<Integer> bubbleSortDemo(Node<Integer> head){
		int n=size(head);
		for(int i=0;i<n;i++) {
			Node<Integer>curr=head;
			Node<Integer>prev=null;
			for(int j=0;j<n-i;j++) {
				if(curr.data<curr.next.data) {
					prev=curr;
					curr=curr.next;
				}else {
					if(prev==null) {
						Node<Integer> fwd=curr.next;
						curr.next=fwd.next;
						fwd.next=curr;
						prev=fwd;
						head=prev;
					}else {
						Node<Integer> fwd=curr.next;
						prev.next=fwd;
						curr.next=fwd.next;
						fwd.next=curr;
					}
				}
			}
		}
		return head;
	}
	
	
	
	
	
	
	
	
	
	public Node<Integer> rearrangeAlternate(Node<Integer> head){
		
		Node<Integer> mid=mid(head);
		Node<Integer> head1=head;
		Node<Integer>head2=mid.next;
		
	    Node<Integer> prev = null;
		Node<Integer> curr = head;
		Node<Integer> fwd=null;
	        while (curr!= null) {
				fwd=head2.next;
	            head2.next = prev;
	            prev = head2;
	            head2 = fwd;
	            
	        }
	
	  return prev;

		//return head;
	}
	
	public static Node<Integer> mid(Node<Integer> head) 
    {
        if (head == null)
            return head;
        Node<Integer> node = head.next;
        Node<Integer> temp = head;
         
        while (node != null)
        {
            node = node.next;
            if(node!=null)
            {
                temp = temp.next;
                node=node.next;
            }
        }
        return temp;
    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	public Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
		Node<Integer> node1 = head1;
		Node<Integer> node2 = head2;
		Node<Integer> res = null;
		Node<Integer> rt = null;

		int n1Size = size(head1);
		int n2Size = size(head2);
		int i = 0, j = 0;
		while (i < n1Size && j < n2Size) {
			if (node1.data < node2.data) {
				Node<Integer> node = new Node<Integer>(node1.data);
				if (res == null) {
					res = node;
					rt = node;
				} else {
					rt.next = node;
					rt = rt.next;
				}
				node1 = node1.next;
				i++;
			} else {
				Node<Integer> node = new Node<Integer>(node2.data);
				if (res == null) {
					res = node;
					rt = node;
				} else {
					rt.next = node;														// 2 5 8 12 -1 3 6 9 -1  123569 12

					rt = rt.next;
				}
				node2 = node2.next;
				j++;
			}
		}

		while (i < n1Size) {
			Node<Integer> node = new Node<Integer>(node1.data);
			rt.next = node;
			rt = rt.next;
			i++;
		}

		while ( j < n2Size) {
			Node<Integer> node = new Node<Integer>(node2.data);
			rt.next = node;
			rt = rt.next;
			j++;
		}

		return res;
	}


	public static Node<Integer> mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
		
        Node<Integer> temp = null;
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;
 
        if (head1.data <= head2.data) 															 //2 5 8 12 -1
        																							//3 6 9 -1

        {
            temp = head1;
            temp.next = mergeTwoList(head1.next, head2);
        } 
        else
        {
            temp = head2;
            temp.next = mergeTwoList(head1, temp.next);
            System.out.println(temp);
        }
        return temp;
 
    }
*/

/*	public static Node<Integer> reverseStack(Node<Integer> s1, Node<Integer> s2) {
		Node<Integer> top=s1;
		//int data=s1.data;
		while(s1!=null) {
		//	Node<Integer> node = new Node<>(s1.data);

		if (s2 == null) {
			top = node;
			s2 = node;
		} else {
			node.next = top;
			top = node;
		}
		s1=s1.next;
		}
		return top;
	}
*/
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter value in First LinkedList ");
		int data1 = s.nextInt();

		LinkList ll1 = new LinkList();
		while (data1 != -1) {
			ll1.addLast(data1);

			data1 = s.nextInt();
		}
		/*System.out.println("Enter value in Second LinkedList");
		int data2 = s.nextInt();

		LinkList ll2 = new LinkList();
		while (data2 != -1) {
			ll2.addLast(data2);

			data2 = s.nextInt();
		}
*/
		// System.out.println("enter pos to add");
		// int pos = s.nextInt();
		// System.out.println("enter data to add");
		// Node removed = ll.removeIthPos(ll.head, pos);
		// System.out.println("Removed : " + removed);
		// ll.addIthPos(ll.head, s.nextInt(), pos);
		// ll.append(ll.head, pos);
		// ll.removeDuplicates(ll.head);
		// ll.bubbleSort(ll.head);
		// ll.swap_nodes(ll.head, 2, 5);
		//Node<Integer> res =ll1.mergeTwoList(ll1.head, ll2.head);
		ll1.print();
	
		//ll1.createCircular(data1);
		//ll1.checkCircular(ll1.head);
		s.close();

	}
	}
