package Binary.Tree2;
/*Given Postorder and Inorder traversal of a binary tree, create the binary tree associated with the traversals.You just need to construct the tree and return the root.
Note: Assume binary tree contains only unique elements.
Input format :
Line 1 : n (Total number of nodes in binary tree)
Line 2 : Post order traversal
Line 3 : Inorder Traversal
Output Format :
Elements are printed level wise, each level in new line (separated by space).
*/

public class ConstructTreeFromPostOrderAndInOrder {
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,int[] in){
	      int n=in.length;
	        Index i = new Index();
	        i.index = n - 1;
	        return buildTree(in, post, 0, n - 1, i);
	    }
		static BinaryTreeNode<Integer> buildTree(int in[], int post[], int start, int end, Index i)   {
	        if (start > end)
	            return null;
	         BinaryTreeNode<Integer> root = new BinaryTreeNode<>(post[i.index]);
	        (i.index)--;
	         if (start == end)
	            return root;
	         int iIndex = findIndex(in, start, end, root.data);
	         root.right = buildTree(in, post, iIndex + 1, end, i);
	        root.left = buildTree(in, post, start, iIndex - 1, i);
	 
	        return root;
	    }
	   static  int findIndex(int arr[], int strt, int end, int value)     {
	        int i;
	        for (i = strt; i <= end; i++)      {
	            if (arr[i] == value)
	                break;
	        }
	        return i;
	    	}
		}
	class Index {
	    int index;
	}
	 

