package pattern;

import java.util.Scanner;

/*Print the following pattern for the given number of rows.
Assume N is always odd
*
* *
  * * *
    * * * *
  * * *
* *
*
*/
public class ArrowPatternUsingStar {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	int s,i,j;
	int sp=n;
	for(s=1;s<=n;s++) {
		for(j=1;j<=sp;j++) {
	System.out.print(" ");
}
for(i=1;i<=s;i++) {
	System.out.print("*"+" ");
}
System.out.println("");
sp++;

}
	for(s=n-1;s>=1;s--) {
				for(j=sp;j>=1;j--) {
			System.out.print(" ");
		}
		for(i=s;i>=1;i--) {
			System.out.print("*"+" ");
		}
		System.out.println("");
		sp--;
		
	}

	}

}
