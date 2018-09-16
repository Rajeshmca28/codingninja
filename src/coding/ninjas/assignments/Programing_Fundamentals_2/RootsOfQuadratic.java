package Programing_Fundamentals_2;

import java.util.Scanner;

/*Write a program to calculate the roots of a given quadratic equation -
a(x^2) + bx + c = 0 
Print roots specifying their nature. If roots are imaginary, no need to print the roots.
*/
public class RootsOfQuadratic {
	public static void main(String[] args) 
    {
      int a, b, c;
      double root1, root2, d;
      Scanner s = new Scanner(System.in);
      a = s.nextInt();
      b = s.nextInt();
      c = s.nextInt();
      d = b * b - 4 * a * c;
      if(d > 0)
      {
          System.out.println(1);
          root1 = ( - b + Math.sqrt(d))/(2*a);
          root2 = (-b - Math.sqrt(d))/(2*a);
          System.out.print(root1+""+root2);
      }
      else if(d == 0)
      {
          System.out.println(0);
          root1 = (-b+Math.sqrt(d))/(2*a);
          System.out.println(root1);
      }
      else
      {
          System.out.println(-1);
      }
  }

}
