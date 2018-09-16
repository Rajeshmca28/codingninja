package BST2;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a binary tree and an integer S, print all the pair of nodes whose sum equals S.
Assume binary tree contains all unique elements.
Note : In a pair, print the smaller element first. Order of different pair doesn't matter.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer S
*/
public class PairSumBinaryTree {
	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
		int[] arr = tree_to_array(root);
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] > sum) {
				j--;
			} else if (arr[i] + arr[j] < sum) {
				i++;
			} else {
				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;
			}
		}
	}

	public static int[] tree_to_array(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new int[0];
		}
		int[] arrl = tree_to_array(root.left);
		int[] arrr = tree_to_array(root.right);
		int[] ans = new int[arrl.length + arrr.length + 1];
		for (int i = 0; i < arrl.length; i++) {
			ans[i] = arrl[i];
		}
		ans[arrl.length] = root.data;
		for (int i = 0; i < arrr.length; i++) {
			ans[i + arrl.length + 1] = arrr[i];
		}

		return ans;
	}

}
