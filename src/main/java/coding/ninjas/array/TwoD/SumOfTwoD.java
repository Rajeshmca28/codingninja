package coding.ninjas.array.TwoD;

import java.util.Scanner;

public class SumOfTwoD {

		  public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    int row =s.nextInt();
		    int col=s.nextInt();
		    int [][] myArray = new int[row][col];
		    for (int i = 0; i <=row; i++)
		    {
		        for(int j = 0; j <=col; j++) {
		        	myArray[i][j] = s.nextInt(); 
		    }

		    int rowSum = 0;
		    int colSum = 0;
		    int c=0,r=0;
		    for(c = 0; c<=col;c++)
		      rowSum = rowSum + myArray[c][r];
		       for( r = 0; r<=row; r++)
		        System.out.println("Sum of row " + r + " is " + rowSum);

		    for( r=0; r<=row;r++)
		     colSum = colSum + myArray[r][c];
		      for(c = 0; c<=col; c++)
		       System.out.println("Sum of column " + c + " is " + colSum);    
		  }
		  }
}


