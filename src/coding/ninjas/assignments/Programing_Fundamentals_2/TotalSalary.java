package Programing_Fundamentals_2;

import java.util.Scanner;

/*Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
totalSalary = basic + hra + da + allow – pf
where :
hra   = 20% of basic
da    = 50% of basic
allow = 1700 if grade = ‘A’
allow = 1500 if grade = ‘B’
allow = 1300 if grade = ‘C' or any other character
pf    = 11% of basic.
*/
public class TotalSalary {
	public static void main(String[] args) {
		// Write your code here
      Scanner s = new Scanner(System.in);
      int basicSalary = s.nextInt();
      char Grade = s.next().charAt(0);
      double hra,da,pf;
      double allow;
      int totalSalary;
      if(Grade =='A'){
        allow = 1700;
      }
      else if(Grade =='B'){
        allow = 1500;
      }
      else{
        allow = 1300;
      }
      double bs = basicSalary;
      hra = 0.2*bs;
      da = 0.5*bs;
      pf = 0.11*bs;
      
      totalSalary = (int)Math.round((bs+hra+da+allow-pf));
      System.out.print(totalSalary);


	}
}
