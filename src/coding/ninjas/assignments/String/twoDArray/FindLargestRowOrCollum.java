package String.twoDArray;
/*Given an NxM 2D array, you need to find out which row or column has largest sum (sum of its elements) overall amongst all rows and columns.
Input Format :
 Line 1 : 2 integers N and M respectively, separated by space 
 Line 2: Single line having N*M elements entered in row wise manner, each separated by space.
*/
public class FindLargestRowOrCollum {

	public static void findLargest(int input[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
      int maxrow = Integer.MIN_VALUE;
      int maxcol=Integer.MIN_VALUE;
			int row=input.length;
   			int col = input[0].length;
	    		int i,j;
      int maxcolIndex=0,maxrowIndex=0;
        for (i = 0; i < row; i++) 
        {
         int rsum=0;
            for (j = 0; j < col; j++) 
            {
                rsum = rsum + input[i][j] ;
            }
          if(rsum>maxrow){
            maxrow=rsum;
            maxrowIndex=i;
          }
 
           
        }
        
        for (i = 0; i < col; i++) 
        {
          int colsum=0;
            for (j = 0; j < row; j++) 
            {
                colsum = colsum + input[j][i] ;
            }
 
          if(colsum>maxcol){
            maxcol=colsum;
            maxcolIndex=i;
          }
        }
        if(maxcol<maxrow){
                      System.out.print("row "+maxrowIndex+" "+maxrow);
        }
      else 
          System.out.print("column "+maxcolIndex+" "+maxcol);
    }
}
