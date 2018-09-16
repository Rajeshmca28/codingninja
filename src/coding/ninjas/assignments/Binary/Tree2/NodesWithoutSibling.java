package Binary.Tree2;

/*Given a binary tree, print all nodes that don’t have a sibling.
Edit : Print the elements in different lines. And order of elements doesn't matter.
Input format :
Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.
*/
public class NodesWithoutSibling {
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {

		if (root == null)
			return;

		if (root.left != null && root.right != null) {
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}

		else if (root.right != null) {
			System.out.println(root.right.data + " ");
			printNodesWithoutSibling(root.right);
		}

		else if (root.left != null) {
			System.out.println(root.left.data + " ");
			printNodesWithoutSibling(root.left);
		}
	}

}
