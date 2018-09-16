package pattern;

import java.util.Scanner;

/*Print the following pattern for the given N number of rows.
1
1 1
1 1 1
1 1 1 1
*/public class NumberPattern3 {
	public static void main(String[] args) {
		// Write your code here
     Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int x=1;
    pattern1(n,x);
    }
      public static void pattern1(int n,int x){
      for(int i=1;i<=n;i++)
	{
	for(int j=1;j<=i;j++){
	System.out.print(x);
	}
	System.out.println("");
	}
	}

}
