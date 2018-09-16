package BST1;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree) or not. If yes, return true, return false otherwise.
Duplicate elements should be in right subtree.
Input format :
Line 1 : Nodes in level order form (separated by space). If any node does not have left or right child, take -1 in its place
Output format :
true or false
*/
public class CheckBST {
	public static boolean isBST(BinaryTreeNode<Integer> root) {
			/* Your class should be named Solution
			* Don't write main().
			* Don't read input, it is passed as function argument.
			* Return output and don't print it.
			* Taking input and printing output is handled automatically.
			*/
			return isBSTRange(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
	  static boolean isBSTRange(BinaryTreeNode<Integer> root,int max,int min){
	    if(root==null){
	      return true;
	          }
	    if(!(root.data>min&&root.data<max)){
	      return false;
	    }
	    return isBSTRange(root.left,root.data,min)&&isBSTRange(root.right,max,root.data);
	  }

}
