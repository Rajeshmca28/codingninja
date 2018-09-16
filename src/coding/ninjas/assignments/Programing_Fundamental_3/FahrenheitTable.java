package Programing_Fundamental_3;
/*Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
Input Format :
3 integers - S, E and W respectively separated by space.
*/
public class FahrenheitTable {
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
      int c;
		while (start <=end) {
			c =((start - 32)*5)/9;
			System.out.print(start);
			System.out.print("\t");
			System.out.print(c);
			start = start+step;
          			System.out.println();

        }
}

}
