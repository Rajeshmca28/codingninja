package Programing_Fundamental_4;

import java.util.Scanner;

/*Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
Note : The given input number could be large, so the corresponding binary number can exceed the integer range. So take the answer as long.
*/
public class DecimalToBinary {
	public static void main(String[] args) {
		// Write your code here
Scanner s=new Scanner(System.in);
int n=s.nextInt();
    
    	long  a, b=0,m=1;
  while(n>0){
	a=n%2;
    n=n/2;
    b=b+m*a;
    m=m*10;
  }
    
   System.out.print(b);

	}
}
