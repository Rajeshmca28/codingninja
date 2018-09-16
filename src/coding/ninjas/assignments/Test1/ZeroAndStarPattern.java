package Test1;

import java.util.Scanner;

/*Print the following pattern
Pattern for N = 4
*000*000*
0*00*00*0
00*0*0*00
000***000
*/
public class ZeroAndStarPattern {
	public static void main(String[] args) {

		/*
		 * Read input as specified in the question. Print output as specified in the
		 * question.
		 */

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n * 2 + 1; j++) {
				if (j == i || j == n + 1 || n * 2 + 2 - j == i) {
					System.out.print("*");
				} else {
					System.out.print("0");
				}
			}
			System.out.println("");
		}
	}

}
