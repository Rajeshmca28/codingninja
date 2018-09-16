package String.twoDArray;

import java.util.Scanner;

/*Given a 2D integer array of size M*N, find and print the sum of ith row elements separated by space.
Input Format :
Line 1 : Two integers M and N (separated by space)
Next M lines : ith row elements (separated by space)
*/
public class RowWiseSum {
	public static void main(String[] args) {
		/*
		 * Your class should be named Solution. Read input as specified in the question.
		 * Print output as specified in the question.
		 */
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
