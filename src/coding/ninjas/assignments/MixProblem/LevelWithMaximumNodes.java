package MixProblem;

import java.util.LinkedList;

/*Given a generic tree, return the level number, which is having maximum number of nodes(root is level 0).
Note : If there are multiple levels having maximum number of nodes, print the level which comes first.
Input format :
Line 1 : Elements will be input in level order form separated by space. Order is - 
Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element. 
Output format
Line 1 : Level with maximum nodes
*/
public class LevelWithMaximumNodes {
	public static int maxLevel(TreeNode<Integer> root) {
		int ans = 0;
		int level = 0;
		int count = 0;
		int anscount = 0;
		if (root == null)
			return 0;

		LinkedList<TreeNode<Integer>> queue = new LinkedList<>();
		queue.addLast(root);
		while (true) {
			int nodeCount = queue.size();
			count = nodeCount;
			if (queue.isEmpty())
				break;
			while (nodeCount > 0) {
				TreeNode<Integer> node = queue.removeFirst();
				for (int i = 0; i < node.children.size(); i++) {
					queue.addLast(node.children.get(i));
				}
				nodeCount--;
			}
			if (count > anscount) {
				ans = level;
				anscount = count;
			}
			level++;
		}
		return ans;
	}

}
