package Programing_Fundamental_3;

import java.util.Scanner;

/*Nth term of fibonacci series F(n) is calculated using following formula -
F(n) = F(n-1) + F(n-2), 
Provided N you have to find out the Nth Fibonacci Number. Also F(1) = F(2) = 1
*/
public class NthFibbonacciNumber {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
Scanner s=new Scanner(System.in);
      int n=s.nextInt();
fiboSeries(n);
    }
      public static void fiboSeries(int n){
		int x=0;
      int y=1;
      int z;
     for(int i=0;i<n;i++)
     {
        z=x+y;
        x=y;
		y=z;
         
    }
    System.out.println(x);
  
	}


}
