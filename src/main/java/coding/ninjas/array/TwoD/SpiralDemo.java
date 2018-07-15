package coding.ninjas.array.TwoD;

import java.util.Scanner;

public class SpiralDemo {
	    static void spiralPrint(int row, int col, int a[][])
	    {
	        int i, r = 0, c = 0;
	          
	        while (r < row && c < col)
	        {
	            for (i = c; i < col; ++i)
	            {
	                System.out.print(a[r][i]+" ");
	            }
	            r++;
	  
	            for (i = r; i < row; ++i)
	            {
	                System.out.print(a[i][col-1]+" ");
	            }
	            col--;
	  
	            if ( r < row)
	            {
	                for (i = col-1; i >= c; --i)
	                {
	                    System.out.print(a[row-1][i]+" ");
	                }
	                row--;
	            }
	  
	            if (c < col)
	            {
	                for (i = row-1; i >= r; --i)
	                {
	                    System.out.print(a[i][c]+" ");
	                }
	                c++;    
	            }        
	        }
	    }
	     
	    public static void main (String[] args) 
	    {
	    	Scanner scan = new Scanner(System.in);
			int row = scan.nextInt();
			int col = scan.nextInt();
			int[][] myArray = new int[row][col];

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					myArray[i][j] = scan.nextInt();
				}
			}

	        spiralPrint(row,col,myArray);
	    }
	}
//32 75 82 93 34 65 20 85 45 44 98 47 100 8 14 5 8 33 37 28 5 45 2 0 17 12 64 24 11 23 17 72 21 73 90 14 1 51 11 6 52 72 24 66 90 34 73 29 14 33 76 7 57 84 16 51 28 15 97 30 43 9 55 3 3 23 3 13 16 19 32 58 27 0 4 39 34 7 57 59 93 4 12 45 71 74 61 43 8 2 1 13 54 29 92 99 66 28 18 6 


