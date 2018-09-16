package Programming_Fundamentals_1;
//==>Given a number N, print sum of all even numbers from 1 to N.

import java.util.Scanner;

public class SumOfEvenNoTillN {
public static void main(String[] args) {
		
		
       int i,sum=0;
Scanner s=new Scanner(System.in);
int n=s.nextInt();
    
    for(i=2; i<=n; i+=2)
    {
        sum += i;
    }
System.out.print(sum);

}
}
