package pattern;

import java.util.Scanner;

/*Print the following 
patternPattern for N = 4
   *
  ***
 *****
*******
*/
public class StarPattern1 {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int m=1;
      int sp=n-1;
      
      for(int i=0;i<n;i++){
  for(int j=sp;j>i;j--){
    System.out.print(" ");
        }
        for(int k=0;k<m;k++){
          System.out.print("*");
        }
        m+=2;
  System.out.println();
}
		
	}

}
