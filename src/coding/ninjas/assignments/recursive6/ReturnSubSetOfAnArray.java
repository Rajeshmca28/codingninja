package recursive6;
/*Given an integer array (of length n), find and return all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important.
Input format :
Line 1 : Size of array
Line 2 : Array elements (separated by space)
*/

public class ReturnSubSetOfAnArray {
	public static int[][] subSetDemo(int[] arr, int index) {
		if (arr.length == index) {
			int[][] ans = new int[1][0];
			return ans;
		}
		int[][] smallAns = subSetDemo(arr, index + 1);
		int[][] ans = new int[smallAns.length * 2][];

		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = new int[smallAns[i].length];
			ans[i] = smallAns[i];
		}
		for (int i = 0; i < smallAns.length; i++) {
			ans[i + smallAns.length] = new int[smallAns[i].length + 1];
			ans[i + smallAns.length][0] = arr[index];
			for (int j = 1; j < ans[i + smallAns.length].length; j++) {
				ans[i + smallAns.length][j] = smallAns[i][j - 1];
			}

		}
		return ans;
	}

	public static int[][] subsets(int input[]) {
		// Write your code here
		int index = 0;
		return subSetDemo(input, index);

	}
}
