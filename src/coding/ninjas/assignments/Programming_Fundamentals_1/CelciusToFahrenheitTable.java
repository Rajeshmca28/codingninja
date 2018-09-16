package Programming_Fundamentals_1;
//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.

import java.util.Scanner;

public class CelciusToFahrenheitTable {
public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/

		int C;
		
		Scanner s= new Scanner(System.in);
	int F = s.nextInt();

      int max = s.nextInt();
      int step=s.nextInt();
		while (F <= max) {
			C = 5* (F - 32)/9;
			System.out.println(F + "\t" + C);
			F = F+step;
		}

	}

}
