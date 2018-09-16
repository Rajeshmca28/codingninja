package Binary.Tree1;

/*Given a Binary Tree and an integer x, check if node with data x is present in the input binary tree or not. Return true or false.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer x
*/
public class FindNode {
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {

		if (root == null) {
			return false;
		}
		if (root.data.equals(x)) {
			return true;
		}
		return isNodePresent(root.left, x) || isNodePresent(root.right, x);

	}

}
