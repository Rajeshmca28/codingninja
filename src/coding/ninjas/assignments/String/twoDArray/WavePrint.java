package String.twoDArray;
/*Given a two dimensional n*m array, print the array in a sine wave order. i.e. print the first column top to bottom, next column bottom to top and so on.
Note : Print the elements separated by space.
Input format :
Line 1 : Two integers n and m, No. of rows & No. of columns (separated by space)
Next n lines : ith row elements (separated by space)
*/
public class WavePrint {
public static void wavePrint(int input[][]){
		
		// Write your code here
int m=input.length;
      int n=input[0].length;
      for(int j=0;j<n;j++)
          {
            if(j%2==0){
              for(int i=0;i<m;i++){
                System.out.print(input[i][j]+" ");
              }
            }
        else{
          for(int k=m-1;k>=0;k--){
            System.out.print(input[k][j]+" ");
          }
        }
          }
	}
}
