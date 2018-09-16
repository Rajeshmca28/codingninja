package BST1;

import com.coding.ninja.linked.list.BinaryTreeNode;

/*Given a sorted integer array A of size n which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
Note : If array size is even, take first mid as root.
Input format :
Line 1 : Integer n (Size of array)
Line 2 : Array elements (separated by space)
Output Format :
BST elements (in pre order traversal, separated by space)
*/
public class ConstructBST {
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
         		*/
      
      int len=arr.length;
      return constructBST(arr,0,len-1);
      
    }
	static BinaryTreeNode<Integer> constructBST(int arr[], int start, int end) {
 
        if (start > end) {
            return null;
        }
 
        int mid = (start + end) / 2;
        BinaryTreeNode<Integer> node = new BinaryTreeNode<Integer>();
 
        node.left = constructBST(arr, start, mid - 1);
 
        node.right = constructBST(arr, mid + 1, end);
         
        return node;
    }

}
