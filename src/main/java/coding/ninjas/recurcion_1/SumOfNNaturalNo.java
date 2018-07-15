package coding.ninjas.recurcion_1;

import java.util.Scanner;

public class SumOfNNaturalNo {
public static int sum(int n) {
	if (n != 0)
         return n + sum(n - 1);
     else
         return n;
 }
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	System.out.println(sum(n));

}

}
