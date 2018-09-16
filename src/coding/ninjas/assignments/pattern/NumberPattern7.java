package pattern;

import java.util.Scanner;

/*Print the following pattern for the given number of rows
333
233
123
*/
public class NumberPattern7 {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
		int i,j;
		for(i=0;i<n;i++){
          for(j=i;j>0;j--){
            System.out.print(n-j);
          }
          for(int k=i;k<n;k++){
            System.out.print(n);
          }
          System.out.println();
        }
    }
}
