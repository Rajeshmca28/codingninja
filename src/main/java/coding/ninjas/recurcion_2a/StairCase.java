package coding.ninjas.recurcion_2a;

import java.util.Scanner;

public class StairCase {
	public static void main(String[] args) {
		System.out.println("Please Enter no of Stairs");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	System.out.println(findWays(n)) ;
	}
	public static int findWays(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		if(n==3) {
			return 3;
		}
		return findWays(n-1)+findWays(n-2)+findWays(n-3);
}
	

}
