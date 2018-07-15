package coding.ninjas.recurcion_2b;

public class ReturnSubSetSumToK {
	public static int[][] subSetSumToK(int[] input, int k, int index) {
		if (input.length == index) {
			if (k == 0) {
				int[][] arr = new int[1][0];
				return arr;
			} else {
				int[][] arr = new int[0][0];
				return arr;
			}
		}
		
		int[] s1=new int[input.length];
		int[] s2=new int[s1.length];
		int[][] result=new int[s1.length+s2.length][];
		result = subSetSumToK(input, k - input[index], index + 1);// create first 2d Array s1 include index
		//int[][] s2 = subSetSumToK(input, k, index + 1);// create second 2d Array s2 include index
		// create third 2d Array for add both s1 and s2

		for (int i = 0; i < s1.length; i++) {
			// fill the first array s1
			result[i] = new int[s1.length];
			result[i][0] = input[index];

			for (int j = 0; j < s1.length; j++) {
				result[i][j + 1] = s1[i];
			}
		}
		// fill the second array s2
		for (int i = 0; i < s2.length; i++) {
			result[i + s1.length] = new int[s2.length];
			result[i + s1.length] = s1;
		}
		return result;
	}

	
	public static void main(String[] args) {
		int[] input = { 4, 5, 8, 9, 3, 4, 6 };
		int k = 13;
		int index = 0;
		int[][] arr = subSetSumToK(input, k, index);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
