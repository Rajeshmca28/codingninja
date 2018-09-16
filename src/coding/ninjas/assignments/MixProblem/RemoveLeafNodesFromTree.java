package MixProblem;

import java.util.ArrayList;

class TreeNod<T> {
	T data;
	ArrayList<TreeNod<T>> children;

	TreeNod(T data){
		this.data = data;
		children = new ArrayList<TreeNod<T>>();
	}
}
/*Remove all leaf nodes from a given generic Tree. Leaf nodes are those nodes, which don't have any children.
Note : Root will also be a leaf node if it doesn't have any child. You don't need to print the tree, just remove all leaf nodes and return the updated root.
Input format :
Line 1 : Elements in level order form separated by space (as per done in class). Order is - `

Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element `
Output Format :
Elements are printed level wise, each level in new line (separated by space)
*/
public class RemoveLeafNodesFromTree {
	public static TreeNod<Integer> removeLeafNodes(TreeNod<Integer> root) {

		if (root == null)
			return null;

		if (root.children.size() == 0) {
			return null;
		}
		ArrayList<TreeNod<Integer>> newarray = new ArrayList<TreeNod<Integer>>();
		for (int i = 0; i < root.children.size(); i++) {
			TreeNod<Integer> head = removeLeafNodes(root.children.get(i));
			if (head != null)
				newarray.add(head);

		}
		// root.children.add(naya);
		root.children = newarray;
		return root;
	}

}
