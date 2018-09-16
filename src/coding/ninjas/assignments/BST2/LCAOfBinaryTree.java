package BST2;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a binary tree and two nodes, find LCA (Lowest Common Ancestor) of the given two nodes in Binary Tree. Read about LCA if you are having doubts about the definition.
If out of 2 nodes only one node is present, return that node.
If both are not present, return -1.
Input format :
Line 1 :  Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Two integers, Node 1 and Node 2 (separated by space)
*/
public class LCAOfBinaryTree {
	public static int lcaBinaryTree(BinaryTreeNode<Integer> root, int a, int b) {
		// Write your code here
		if (root == null) {
			return -1;
		}
		if (root.data == a || root.data == b) {
			return root.data;
		}
		int left = lcaBinaryTree(root.left, a, b);
		int right = lcaBinaryTree(root.right, a, b);

		if (left == -1 && right == -1) {
			return -1;
		}
		if (left == -1 && right != -1) {
			return right;
		}
		if (right == -1 && left != -1) {
			return left;
		}
		return root.data;

	}
}
