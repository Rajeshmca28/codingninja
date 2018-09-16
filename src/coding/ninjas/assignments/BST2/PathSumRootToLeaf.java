package BST2;
/*Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number k.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : k
Output format : Print each path in new line, elements separated by space
*/

import com.coding.ninja.linked.list.BinaryTreeNode;

public class PathSumRootToLeaf {
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		// Write your code here
		rootToLeafSumK(root, k, "");
	}

	public static void rootToLeafSumK(BinaryTreeNode<Integer> root, int k, String s) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null && root.data == k) {
			System.out.println(s + root.data);
		}
		rootToLeafSumK(root.left, k - root.data, s + root.data + " ");
		rootToLeafSumK(root.right, k - root.data, s + root.data + " ");
	}

}
