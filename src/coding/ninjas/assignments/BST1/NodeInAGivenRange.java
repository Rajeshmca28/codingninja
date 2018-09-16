package BST1;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a Binary Search Tree and two integers k1 and k2, find and print the elements which are in range k1 and k2 (both inclusive).
Print the elements in increasing order.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Two Integers k1 and k2
Output Format :
Required elements (separated by space)
*/
public class NodeInAGivenRange {
	public static void printNodeFromK1ToK2(BinaryTreeNode<Integer> root, int k1, int k2) {

		if (root == null) {
			return;
		}

		if (k1 < root.data) {
			printNodeFromK1ToK2(root.left, k1, k2);
		}

		if (k1 <= root.data && k2 >= root.data) {
			System.out.print(root.data + " ");
		}

		if (k2 > root.data) {
			printNodeFromK1ToK2(root.right, k1, k2);
		}
	}

}
