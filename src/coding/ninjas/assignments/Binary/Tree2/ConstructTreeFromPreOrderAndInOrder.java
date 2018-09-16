package Binary.Tree2;

/*Given Preorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.You just need to construct the tree and return the root.
Note: Assume binary tree contains only unique elements.
Input format :
Line 1 : n (Total number of nodes in binary tree)
Line 2 : Pre order traversal
Line 3 : Inorder Traversal
Output Format :
Elements are printed level wise, each level in new line (separated by space).
*/class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}

public class ConstructTreeFromPreOrderAndInOrder {
	static int preIndex = 0;

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in) {
		int len = in.length;
		return buildTree(in, pre, 0, len - 1);

	}

	static BinaryTreeNode<Integer> buildTree(int in[], int pre[], int inStrt, int inEnd) {
		if (inStrt > inEnd)
			return null;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(pre[preIndex++]);
		if (inStrt == inEnd)
			return root;
		int inIndex = findIndex(in, inStrt, inEnd, root.data);
		root.left = buildTree(in, pre, inStrt, inIndex - 1);
		root.right = buildTree(in, pre, inIndex + 1, inEnd);

		return root;
	}

	static int findIndex(int arr[], int strt, int end, int value) {
		int i;
		for (i = strt; i <= end; i++) {
			if (arr[i] == value)
				return i;
		}
		return i;
	}
}
