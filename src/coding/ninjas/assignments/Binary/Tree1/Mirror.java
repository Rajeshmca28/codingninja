package Binary.Tree1;
/*Mirror the given binary tree. That is, right child of every nodes should become left and left should become right.
Alt text

Note : You don't need to print or return the tree, just mirror it.
Input format :

Line 1 : Elements in level order form (separated by space)

(If any node does not have left or right child, take -1 in its place)

Output format : Elements in level order form (Every level in new line)
*/

public class Mirror {
	public static void mirror(BinaryTreeNode<Integer> root){
		
if(root==null) {
			return;
		}
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
	
	}

}
