package Test1;

import java.util.Scanner;

/*Print the following pattern for given number of rows.
Input format :Integer N (Total number of rows)
Input:5
Output:
5432*
543*1
54*21
5*321
*4321
*/
public class NumberStarPattern {
	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int i,j;
      for(i=1;i<=n;i++){
        for(j=n;j>=1;j--){
          if(i==j)
            System.out.print("*");
        else
      System.out.print(j);

            }
        System.out.println("");
	}
}
}
