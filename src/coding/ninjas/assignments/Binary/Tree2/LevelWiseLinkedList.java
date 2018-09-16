package Binary.Tree2;

import java.util.ArrayList;
import java.util.LinkedList;

import com.coding.ninja.linked.list.BinaryTreeNode;

 

 class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}
public class LevelWiseLinkedList {
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		ArrayList<Node<BinaryTreeNode<Integer>>> ans = new ArrayList<Node<BinaryTreeNode<Integer>>>();
		if (root == null) {
			return ans;
		}
		LinkedList<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.addLast(root);
		while (true) {
			int nodeCount = queue.size();
			if (queue.isEmpty()) {
				break;
			}
			Node<BinaryTreeNode<Integer>> head = null;
			while (nodeCount > 0) {
				BinaryTreeNode<Integer> node = queue.removeFirst();
				head = addNodeToEnd(head, node);
				if (node.left != null) {
					queue.addLast(node.left);
				}
				if (node.right != null) {
					queue.addLast(node.right);
				}
				nodeCount--;
			}
			ans.add(head);
			head = null;
		}
		return ans;
	}

	private static Node<BinaryTreeNode<Integer>> addNodeToEnd(Node<BinaryTreeNode<Integer>> head,
			BinaryTreeNode<Integer> node) {
		if (head == null) {
			head = new Node<BinaryTreeNode<Integer>>(node);
		} else {
			Node<BinaryTreeNode<Integer>> temp = head;
			Node<BinaryTreeNode<Integer>> abc = new Node<>(node);
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = abc;
		}
		return head;
	}
public static void main(String[] args) {
	
}
}

