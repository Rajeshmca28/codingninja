package Binary.Tree2;

import java.util.Stack;

/*Given a binary tree, print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even level right to left.
Input format :
Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Output Format :
Elements are printed level wise, each level in new line (separated by space).
Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output :
5
10 6
2 3
9

*/
public class ZigZagTree {

	static void printZigZag(BinaryTreeNode<Integer> root) {
		int leftToRight = 1;
		Stack<BinaryTreeNode<Integer>> currentLevel = new Stack<>();
		Stack<BinaryTreeNode<Integer>> nextLevel = new Stack<>();
		Stack<BinaryTreeNode<Integer>> temp1;
		BinaryTreeNode<Integer> temp;

		currentLevel.push(root);

		while (!currentLevel.isEmpty()) {

			temp = currentLevel.pop();

			System.out.print(temp.data + " ");

			if (leftToRight == 1) {

				if (temp.left != null) {
					nextLevel.push(temp.left);
				}
				if (temp.right != null) {
					nextLevel.push(temp.right);
				}
			} else {
				if (temp.right != null) {
					nextLevel.push(temp.right);
				}
				if (temp.left != null) {
					nextLevel.push(temp.left);
				}
			}

			if (currentLevel.isEmpty()) {

				if (leftToRight == 1) {
					leftToRight = 0;
				} else {
					leftToRight = 1;
				}
				System.out.println();

				temp1 = currentLevel;
				currentLevel = nextLevel;
				nextLevel = temp1;
			}
		}
	}

}
