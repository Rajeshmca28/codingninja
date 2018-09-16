package pattern;

import java.util.Scanner;

/*Print the following 
patternPattern for N = 4
1
23
345
4567
*/
public class NumberPattern1 {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

Scanner s=new Scanner(System.in);
int N=s.nextInt();
    int i, j, k;

    for(i=1; i<=N; i++)
    {
        k = i;
        for(j=1; j<=i; j++, k++)
        {
System.out.print(k);
        }
System.out.println();
}
}
}
