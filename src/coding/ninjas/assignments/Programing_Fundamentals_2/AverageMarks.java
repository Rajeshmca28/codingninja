package Programing_Fundamentals_2;

import java.util.Scanner;

/*Write a program to input name (as a single character) and marks of three tests of a student (all integers). Then calculate and print the name and average (integer) of best two test marks.
All the test marks are integers and calculate average also as integer. That is, you need to print the integer part of average only, neglect the decimal part.

*/
public class AverageMarks {
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
		      String name=sc.nextLine();
		      int sub1=sc.nextInt();
		      int sub2=sc.nextInt();
		      int sub3=sc.nextInt();

			// Write your code here
		     avgDemo(name,sub1,sub2,sub3);
	    }
		  public static void avgDemo(String name,int sub1,int sub2,int sub3){
	        
	      int x=(sub1<sub2?sub1:sub2);
		    	 int z=(x<sub3?x:sub3);
		      
		      int avg=(sub1+sub2+sub3-z)/2;
		      System.out.print(name);
		      System.out.print(" ");
		      System.out.print(avg);
	      }
}
