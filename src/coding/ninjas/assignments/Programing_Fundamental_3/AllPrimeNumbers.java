package Programing_Fundamental_3;

import java.util.Scanner;

/*Given an integer N, print all the prime numbers that lies in between 2 to N (both inclusive).
Print the prime numbers in different lines.
*/
public class AllPrimeNumbers {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
	primeDemo(n);
      }
     public static void primeDemo(int n) {
      	int k=0;
		int i=2;
      
		while(i<=n){
		int j=2;
		while(j<i-1)
	{
	if(i%j==0){
		k=k+1;
	}
	j=j+1;
	}
	if(k==0){
	System.out.println(i);
	}
	else
	{
	k=0;
	}
	i=i+1;
	}
    }
}
