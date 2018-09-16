package Test1;

import java.util.Scanner;

/*Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
*/
public class CheckArmsStrong {
	public static void main(String[] args) {
	      Scanner s=new Scanner(System.in);
	      int num=s.nextInt();
	      int rem,n,res=0;

	      n=num;
	      while(n!=0){
	        rem=n%10;
	        res+=rem*rem*rem;
	        n/=10;
	              }
	      if(res==num) {
	        System.out.print(true);
	      }else {
	        System.out.print(false);
		}
}
}
