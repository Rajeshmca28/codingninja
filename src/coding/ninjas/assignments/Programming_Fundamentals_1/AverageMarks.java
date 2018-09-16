package Programming_Fundamentals_1;
import java.util.Scanner;
/*==>Write a program to input name (as a single character) and marks of three tests of a student (all integers). Then calculate and print the name and average (integer) of all test marks.
All the test marks are integers and calculate average also as integer. That is, you need to print the integer part of average only, neglect the decimal part.
*/
public class AverageMarks {


		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
		      char ch=sc.next().charAt(0);
		      int s1=sc.nextInt();
		      int s2=sc.nextInt();
		      int s3=sc.nextInt();
	int avg=0,max=0,max1=0;
	      if(s1<s2&&s1<s3){
	        max=s2;
	        max1=s3;
	      }else if(s2<s3&&s2<s1){
	        max=s3;
	        max1=s1;
	      }else{ 
	        max=s1;
	      max1=s2;
	    }  
	      avg=(s1+s2+s3)/3;
	      System.out.println(ch);
		      System.out.print(avg);
	     
			
		}

	}

