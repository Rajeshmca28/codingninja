package Binary.Tree2;

/*Given a binary tree, check if its balanced i.e. depth of left and right subtrees of every node differ by at max 1. Return true if given binary tree is balanced, false otherwise.
Input format :
Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.
Sample Input 1 :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output 1 :
false
*/
public class IsBalanced {
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {

		// Write your code here
		if (root == null)
			return true;

		int leftheight = height(root.left);
		int rightheight = height(root.right);

		if (Math.abs(leftheight - rightheight) <= 1 && checkBalanced(root.left) && checkBalanced(root.right))
			return true;

		return false;

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
