package Binary.Tree1;

/*Given a Binary Tree, find and return the count of leaf nodes. Leaf nodes are those, who don't have any children.
Root is also leaf node if both its child are null.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
*/
public class CountLeafNode {
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null) {
			return 1;
		} else {
			return noOfLeafNodes(root.left) + noOfLeafNodes(root.right);
		}

	}
}
