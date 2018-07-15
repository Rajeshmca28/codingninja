package coding.ninjas.recurcion_1a;

import java.util.Scanner;

public class Multiplication {
	static int multiply(int x, int y) {

		if (x < y)
			return multiply(y, x);

		else if (y != 0)
			return (x + multiply(x, y - 1));

		else
			return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first value:X");
		int x = sc.nextInt();
		System.out.println("Please enter Second value:Y");
		int y = sc.nextInt();
		System.out.println(multiply(x, y));
	}
	
}
