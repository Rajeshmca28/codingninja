package Binary.Tree1;
/*Given a binary tree, find and return the sum of all nodes.
Input format :

Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.
*/
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}
public class SumOfAllNodes {
public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
	if(root == null)
	{
		return 0;
	}
		return (root.data + sum(root.left) + sum(root.right));

	
	
}

}
