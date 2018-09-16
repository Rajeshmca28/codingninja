package recursion4;

/*Given a string S, remove consecutive duplicates from it recursively.
Input Format :String S
Output Format :Output string
*/
public class RemoveDuplicate {
	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
		if (s.length() <= 1)
			return s;
		if (s.substring(1, 2).equals(s.substring(0, 1)))
			return removeConsecutiveDuplicates(s.substring(1));
		else
			return s.substring(0, 1) + removeConsecutiveDuplicates(s.substring(1));
	}

}
