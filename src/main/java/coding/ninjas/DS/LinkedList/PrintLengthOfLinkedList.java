package coding.ninjas.DS.LinkedList;

import java.util.Scanner;

class  Link {
	int data;
	Link next;

	public  Link(int d) {
		data = d;
	}

}

public class PrintLengthOfLinkedList {
	public static Link prepareLinkedList() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Link head = null;
		Link tail = null;
		while (data != -1) {
			Link link = new Link(data);

			if (head == null) {
				head = link;
				tail = link;
			} else {
				tail.next = link;
				tail = tail.next;

			}
			data = s.nextInt();
		}
		return head;

	}

	
	public static int lengthDemo(Link head){
		
		Link temp=head;
      int count=0;
       while(temp!=null) { 
         count++;
			   temp=temp.next;
		  }
		return count;

}
	public static void main(String[] args) {
		Link n=prepareLinkedList();
		System.out.println(lengthDemo(n));
	}
}
