package com.array;
import java.util.Scanner;

public class ArmStrongDemo {
		
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



//1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748, 