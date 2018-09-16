package Binary.Tree1;

/*Given a Binary Tree, find and return the node with maximum data. Return the complete node. Return null is binary tree is empty.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
*/
public class MaxDataNode {
	public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root) {

		if (root == null)
			return null;

		BinaryTreeNode<Integer> current = root;
		if (root.left != null) {
			if (current.data.compareTo(maxDataNode(root.left).data) < 0) {
				current = maxDataNode(root.left);
			}
		}
		if (root.right != null) {
			if (current.data.compareTo(maxDataNode(root.right).data) < 0) {
				current = maxDataNode(root.right);
			}
		}

		return current;
	}

}
