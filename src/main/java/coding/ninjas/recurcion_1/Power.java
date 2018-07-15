package coding.ninjas.recurcion_1;

import java.util.Scanner;

public class Power {
	public static int powerDemo(int x,int n) {
		
    if ( n == 0 ) {
        return 1;
    }
    return ( x * powerDemo(x,n-1));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println(powerDemo(x,n));
	}

}
