package HashMap1;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a binary tree, print that binary tree in vertical order. Vertical order is -
Print the nodes which are at same vertical order in same line separated by space. Print different levels in different lines.
Order of different levels in different lines is not important. But in one level, print the element in pre-order format.
Input Format :
Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place
*/

class MaxMin {
	int max, min;
}

public class VerticalOrder {
	static MaxMin m = new MaxMin();

	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root) {
		findMinMax(root, m, m, 0);

		for (int i = m.min; i <= m.max; i++) {
			verticalOrder(root, i, 0);
			System.out.println("");
		}
	}

	static void findMinMax(BinaryTreeNode<Integer> root, MaxMin min, MaxMin max, int h) {
		if (root == null)
			return;

		if (h < min.min)
			min.min = h;
		else if (h > max.max)
			max.max = h;

		findMinMax(root.left, min, max, h - 1);
		findMinMax(root.right, min, max, h + 1);
	}

	static void verticalOrder(BinaryTreeNode<Integer> root, int ln, int h) {
		if (root == null)
			return;

		if (h == ln)
			System.out.print(root.data + " ");

		verticalOrder(root.left, ln, h - 1);
		verticalOrder(root.right, ln, h + 1);
	}

}
