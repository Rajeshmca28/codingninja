package pattern;

import java.util.Scanner;

/*Print the following pattern for the given N number of rows.
1
11
121
1221
*/

public class NumberPattern5 {
	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    pattern3(n);
    }
  public static void pattern3(int n){    
       if(n>=1)
  {
   for(int i =0; i<n;i++)
   {
    for(int j=0;j<=i;j++)
    {
     if(i==0)
     {
      System.out.print(1);
      
     }
     else if(j==0 || j==i)
     {
      System.out.print(1);
     }
     else
     {
      System.out.print(2);
      
     }
     
    }
    System.out.println();
    
   }
   
   
  }
    }
}
