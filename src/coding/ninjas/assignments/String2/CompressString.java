package String2;
/*Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.
For e.g. if a String has 'x' repeated 5 times, replace this "xxxxx" with "x5".
Note : Consecutive count of every character in input string is less than equal to 9.
Input Format :
Input string S
*/
public class CompressString {
	public static String compress(String inputString) {
		// Write your code here
      	int l = inputString.length();
		int count = 1;
		String s = "";
		String ss = "";
		for (int i = 0; i < l; i++) {
			if(i+1 == l) {
			//	s = s + inputString.charAt(i);
				//break;
			}
			
			if ((i + 1 < l) && (inputString.charAt(i) == inputString.charAt(i + 1))) {

				count = count + 1;
				if (count > 0)
					s = inputString.charAt(i) + "" + count;

			} else {
				count = 1;
				if (s.isEmpty()) {
					ss = ss + inputString.charAt(i);
				} else {
					ss = ss + s;
				}
				s = "";
			}

		}

		if (!s.isEmpty()) {
			ss = ss + s;
		}

		return ss;
	}
}
