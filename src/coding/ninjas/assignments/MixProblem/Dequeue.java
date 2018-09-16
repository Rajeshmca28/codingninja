package MixProblem;

import java.util.ArrayList;

/*You need to implement a class for Dequeue i.e. for double ended queue. In this queue, elements can be inserted and deleted from both the ends.
You don't need to double the capacity.
You need to implement the following functions -
1. constructor
You need to create the appropriate constructor. Size for the queue passed is 10.
2. insertFront -
This function takes an element as input and insert the element at the front of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
3. insertRear -
This function takes an element as input and insert the element at the end of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
4. deleteFront -
This function removes an element from the front of queue. Print -1 if queue is empty.
5. deleteRear -
This function removes an element from the end of queue. Print -1 if queue is empty.
6. getFront -
Returns the element which is at front of the queue. Return -1 if queue is empty.
7. getRear -
Returns the element which is at end of the queue. Return -1 if queue is empty.
*/

class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;

	TreeNode(T data) {
		this.data = data;
		children = new ArrayList<TreeNode<T>>();
	}
}
	public class Dequeue {
		int arr[];
		int front;
		int rear;
		int size;

		Dequeue(int size) {
			front = -1;
			rear = 0;
			this.size = size;
			arr = new int[size];
		}

		Dequeue() {
			front = -1;
			rear = 0;
			this.size = 10;
			arr = new int[size];
		}

		boolean isFull() {
			return (front == (rear + 1) % size);
		}

		boolean isEmpty() {
			return (front == -1);
		}

		void insertFront(int input) {
			if (isFull()) {
				System.out.println(-1);
				return;
			}
			if (front == -1) {
				front = 0;
				rear = 0;
			} else {
				front = ((front - 1) % size + size) % size;
			}
			arr[front] = input;
		}

		void insertRear(int input) {
			if (isFull())

			{
				System.out.println(-1);
				return;
			}
			if (front == -1) {
				front = 0;
				rear = 0;
			} else {
				rear = (rear + 1) % size;
			}
			arr[rear] = input;
		}

		void deleteFront() {
			if (isEmpty()) {
				System.out.println(-1);
				return;
			}
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % size;
			}
		}

		void deleteRear() {
			if (isEmpty()) {
				System.out.println(-1);
				return;
			}
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				rear = ((rear - 1) % size + size) % size;
			}
		}

		int getFront() {
			if (isEmpty()) {
				return -1;
			}
			return arr[front];
		}

		int getRear() {
			if (isEmpty() || rear < 0) {
				return -1;
			}
			return arr[rear];
		}
	}

