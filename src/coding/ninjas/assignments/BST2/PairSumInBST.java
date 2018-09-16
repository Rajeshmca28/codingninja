package BST2;

import java.util.Stack;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a binary search tree and a integer S, find pair of nodes in the BST which sum to S. You can use extra space only O(log n).
Assume BST contains all unique elements.
Note : In a pair, print the smaller element first.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : S
Output format : Each pair in different line (pair elements separated by space)
*/

public class PairSumInBST {

	static Stack<BinaryTreeNode<Integer>> leftStk = new Stack<>();
	static Stack<BinaryTreeNode<Integer>> rightStk = new Stack<>();

	public static void printNodesSumToS(BinaryTreeNode<Integer> root, int s) {

		if (root == null)
			return;

		leftStk.clear();
		rightStk.clear();

		initLeftStack(root);
		BinaryTreeNode<Integer> left = getNextLeft();

		initRightStack(root);
		BinaryTreeNode<Integer> right = getNextRight();

		while (left != null && right != null && left != right) {
			int localSum = left.data + right.data;

			if (localSum == s) {
				System.out.println(left.data + " " + right.data);
				left = getNextLeft();
			} else if (localSum < s) {
				left = getNextLeft();
			} else {
				right = getNextRight();
			}
		}
	}

	static void initLeftStack(BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> cur = root;

		while (true) {
			if (cur != null) {
				leftStk.push(cur);
				cur = cur.left;
			} else
				break;
		}
	}

	public static BinaryTreeNode<Integer> getNextLeft() {
		if (leftStk == null)
			return null;

		BinaryTreeNode<Integer> ret = leftStk.pop();

		initLeftStack(ret.right);

		return ret;
	}

	static void initRightStack(BinaryTreeNode<Integer> root) {
		BinaryTreeNode<Integer> cur = root;

		while (true) {
			if (cur != null) {
				rightStk.push(cur);
				cur = cur.right;
			} else
				break;
		}
	}

	static BinaryTreeNode<Integer> getNextRight() {
		if (rightStk == null)
			return null;

		BinaryTreeNode<Integer> ret = rightStk.pop();

		initRightStack(ret.left);

		return ret;
	}

}
