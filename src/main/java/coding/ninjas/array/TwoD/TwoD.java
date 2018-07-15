package coding.ninjas.array.TwoD;

import java.util.Scanner;

public class TwoD {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = scan.nextInt();
		int[][] myArray = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				myArray[i][j] = scan.nextInt();
			}
		}

		int i, j, sum = 0;
		for (i = 0; i < row; ++i) {
			for (j = 0; j < col; ++j) {
				sum = sum + myArray[i][j];
			}

			System.out.print(sum + " ");
			sum = 0;

		}

	}
}