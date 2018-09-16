package Binary.Tree2;

/*Remove all leaf nodes from a given Binary Tree. Leaf nodes are those nodes, which don't have any children.
Note : Root will also be a leaf node if it doesn't have left and right child. You don't need to print the tree, just remove all leaf nodes and return the updated root.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Elements are printed level wise, each level in new line (separated by space).
*/
public class RemoveLeafNodes {
	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root) {

		// Write your code here
		if (root == null)
			return null;
		if (root.left == null && root.right == null) {
			return null;
		}
		root.left = removeAllLeaves(root.left);
		root.right = removeAllLeaves(root.right);
		return root;
	}

}
