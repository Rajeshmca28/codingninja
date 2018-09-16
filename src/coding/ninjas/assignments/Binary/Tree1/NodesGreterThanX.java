package Binary.Tree1;
/*Given a Binary Tree and an integer x, find and return the count of nodes which are having data greater than x.
Input format :
Line 1 : Elements in level order form (separated by space)
(If any node does not have left or right child, take -1 in its place)
Line 2 : Integer x
*/
public class NodesGreterThanX {
	public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x){
	
 if (root == null) {
    return 0;
  }

  int countLeft = numNodesGreaterX(root.left, x);
  int countRight = numNodesGreaterX(root.right, x);

  return (root.data > x ? 1 : 0) + countLeft + countRight;
} 
}
