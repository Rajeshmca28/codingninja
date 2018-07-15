package coding.ninjas.recurcion;

public class ReturnSubsetOfK {

	static int[][] returnSubset(int[] arr, int index, int k) {
		if (arr.length == index) {
			if (k == 0) {
				int[][] ans = new int[1][0];
				return ans;
			} else {
				int[][] ans = new int[0][0];
				return ans;
			}
		}

		int[][] res1 = returnSubset(arr, index + 1, k);
		int[][] res2 = returnSubset(arr, index + 1, k - arr[index]);
		int[][] result = new int[res1.length + res2.length][];
		k = 0;
		for (int i = 0; i < res1.length; i++) {
			result[i] = res1[i];
		}
		for (int i = 0; i < res2.length; i++) {
			result[k] = new int[res2[i].length];
		//	System.out.println("index---"+ index+ "result length -"+ result[0].length + result[1].length);
			result[k][0] = arr[index];
			for (int j = 0; j < res2[i].length; j++) {
				result[index][j + 1] = res2[i][j];
			}
		}
		index++;
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 4, 6, 4, 9, 2, 7 };
		int k = 10;
		System.out.println(returnSubset(arr, 0, k));
	}

}
