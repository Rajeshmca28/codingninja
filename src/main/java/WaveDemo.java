
import java.util.Scanner;

public class WaveDemo {
	static void wavePrint(int row, int col, int a[][]) {

		int i,j,k;
		for(i=0;i<col;i++) {
			if(i%2==0) {
				for(j=0;j<row;j++) {
					System.out.print(a[j][i]+" ");
				}
				if(i%2!=0) {
					for(j=row;j>0;j--) {
						System.out.print(a[i][j]+" ");
					}
				}
			}
		
			

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of row");
		int row = scan.nextInt();
		System.out.println("Enter no of col");
		int col = scan.nextInt();
		System.out.println("Enter value of matrix");
		int[][] myArray = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				myArray[i][j] = scan.nextInt();
			}
		}

		wavePrint(row, col, myArray);
	}
}
