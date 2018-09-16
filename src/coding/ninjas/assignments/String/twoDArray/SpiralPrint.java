package String.twoDArray;

/*Given an N*M 2D array, print it in spiral form. That is, first you need to print the 1st row, then last column, then last row and then first column and so on.
Print every element only once.
Input format :
Line 1 : N and M, No. of rows & No. of columns (separated by space) followed by N*M  elements in row wise fashion.
*/
public class SpiralPrint {
	static void spiralPrint(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;

		int i, r = 0, c = 0;
		while (r < row && c < col) {
			for (i = c; i < col; ++i) {
				System.out.print(matrix[r][i] + " ");
			}
			r++;

			for (i = r; i < row; ++i) {
				System.out.print(matrix[i][col - 1] + " ");
			}
			col--;

			if (r < row) {
				for (i = col - 1; i >= c; --i) {
					System.out.print(matrix[row - 1][i] + " ");
				}
				row--;
			}

			if (c < col) {
				for (i = row - 1; i >= r; --i) {
					System.out.print(matrix[i][c] + " ");
				}
				c++;
			}
		}
	}

}
