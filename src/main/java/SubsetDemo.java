
public class SubsetDemo {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 8, 9, 1 };
		int[][] ans = subSet(arr, 0);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {

				System.out.print(ans[i][j] + " ");
			}
			System.out.println("");
		}
	}

	public static int[][] subSet(int[] arr, int index) {
		if (arr.length == index) {
			int[][] ans = new int[1][0];
			return ans;
		}
		int[][] smallAns = subSet(arr, index + 1);
		int[][] ans = new int[smallAns.length * 2][];

		for (int i = 0; i < smallAns.length; i++) {
			ans[i] = new int[smallAns[i].length];
			/*
			 * for(int j=0;j<ans[i].length;j++) { ans[i][j]=smallAns[i][j]; }
			 */
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
}
