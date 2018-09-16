package pattern;

import java.util.Scanner;

/*Print the following pattern for the given N number of rows.
1234
123
12
1
*/
public class NumberPattern6 {
	public static void main(String[] args) {
		// Write your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    pattern4(n);  
    }
      public static void pattern4(int n){
      for(int i=1;i<=n;i++){
        System.out.println();
        for(int j=1;j<=(n+1)-i;j++){
          System.out.print(j);
        }
      
      System.out.println();
	}}
}
