package coding.nijas.test1;
import java.util.Scanner;

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


