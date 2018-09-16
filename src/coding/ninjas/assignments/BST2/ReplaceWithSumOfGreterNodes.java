package BST2;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a binary search tree, replace each nodes' data with the sum of all nodes' which are greater or equal than it. You need to include the current node's data also.
That is, if in given BST there is a node with data 5, you need to replace it with sum of its data (i.e. 5) and all nodes whose data is greater than or equal to 5.
You don't need to return or print, just change the data of each node.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output format : Elements are printed in level order wise, every level in new line
*/

public class ReplaceWithSumOfGreterNodes {
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		Sum S = new Sum();
		replaceWithLarge(root, S);

	}

	static void replaceWithLarge(BinaryTreeNode<Integer> root, Sum s) {
		if (root == null)
			return;

		replaceWithLarge(root.right, s);

		s.sum = s.sum + root.data;
		root.data = s.sum;

		replaceWithLarge(root.left, s);
	}

}

class Sum {
	int sum = 0;
}
