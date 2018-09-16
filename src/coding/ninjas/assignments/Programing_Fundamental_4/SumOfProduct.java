package Programing_Fundamental_4;

import java.util.Scanner;

/*Write a program that asks the user for a number N and a choice C. And then give him the possibility to choose between computing the sum and computing the product of 1 ,..., N.
If user enters C is equal to -
 1 : Print sum of 1 to N numbers
 2 : Print product of 1 to N numbers
 Any other number : print -1
*/
public class SumOfProduct {
	public static void main(String[] args) {
		// Write your code here
Scanner s= new Scanner(System.in);
      int N=s.nextInt();
      int C=s.nextInt();
      int sum=0;
      int prod=1;
      if(C==1){
        for(int i=1;i<=N;i++){
          sum=sum+i;
                  
        }
        System.out.print(sum);
      }
      else if(C==2){
        for(int j=1;j<=N;j++){
          prod*=j;
        }
        System.out.print(prod);
      }else{
        System.out.print("-1");
      }
	}
}
