package Binary.Tree2;
/*Given a binary tree, print the level order traversal. Make sure each level start in new line.
Input format :
Elements in level order form (separated by space). If any node does not have left or right child, take -1 in its place.
Output Format :
Elements are printed level wise, each level in new line (separated by space).
Sample Input :
5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
Sample Output :
5 
6 10 
2 3 
9
*/
public class LevelOrderTraversal {
public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here
int h = height(root);
    int i;
    for (i=1; i<=h; i++)
    {
        findLevel(root, i);
      System.out.println();
    }

	}
static void findLevel(BinaryTreeNode<Integer> root, int level)
{
    if (root == null)
        return;
    if (level == 1){
        System.out.print(root.data+" ");
    }
    else if (level > 1)
    {
        findLevel(root.left, level-1);
        findLevel(root.right, level-1);
    }

}
public static int height(BinaryTreeNode<Integer> root){
 		if (root==null) return 0;
 		return 1 + Math.max(height(root.left),height(root.right));
 	}

}
