package coding.nijas.test1;

import java.util.Scanner;

public class C2F {
			public static void main(String[] args) {
			int C;
			int F = 0;

			Scanner s= new Scanner(System.in);
			int n = s.nextInt();
			int step=s.nextInt();
			while (F <= n) {
				C = 5 * (F - 32)/9;
				System.out.println(F + "\t" + C);
				F = F+20;
			}
		}
	}

