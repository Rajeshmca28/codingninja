package pattern;

import java.util.Scanner;

/*Print the following pattern for the given N number of rows.
1
11
202
3003
*/
public class NumberPattern4 {
	public static void main(String[] args) {
		// Write your code here
		Scanner s=new Scanner(System.in);
    int n=s.nextInt();
pattern2(n);
    }
      public static void pattern2(int n){
    int i, j,x = -1;
    for (i = 1; i <= n; i++)
    {
        if (x < 1)
        {
            for (j = 1; j <= i; j++)
                System.out.print(1);
        }
        else
        {
           for (j = 1; j <= i; j++)
           {
               if(j==1 || j==i)
              System.out.print(i-1);
               else
                System.out.print(0);
           }
        }
System.out.println();
        x++;
    }

}
}
