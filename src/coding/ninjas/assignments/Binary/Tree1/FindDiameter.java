package Binary.Tree1;

/*Given a Binary Tree, find and return the diameter of input binary tree.
Diameter is - largest count of nodes between any two leaf nodes in the binary tree (both the leaf nodes are inclusive).
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
*/
public class FindDiameter {
	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return 0;
		}
		int leftD = diameterOfBinaryTree(root.left);
		int rightD = diameterOfBinaryTree(root.right);
		int mid = height(root.left) + height(root.right) + 1;
		return Math.max(Math.max(leftD, rightD), mid);
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;

	}

}
