package pattern;

import java.util.Scanner;

/*Print the following pattern for the given number of rows.
  1 
 232
34543
*/
public class TringleOfNumber {
	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
    int  j, i, num = 1, sp;
Scanner s=new Scanner(System.in);
 int n=s.nextInt();
      sp = n - 1;
 
      for ( i = 1 ; i <= n ; i++ )
      {
          num = i;
 
          for ( j = 1 ; j <= sp ; j++ )
System.out.print(" "); 
          sp--;
 
          for ( j = 1 ; j <= i ; j++ )
          {
		  System.out.print(num);
              num++;
          }
          num--;
          num--;
          for ( j = 1 ; j < i ; j++)
          {
System.out.print(num);
              num--;
          }
System.out.println("");  
    }
}
}
