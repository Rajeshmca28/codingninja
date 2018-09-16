package String.twoDArray;
/*Given a string S, reverse each word of a string individually. For eg. if a string is "abc def", reversed string should be "cba fed".
Input Format :
String S
*/
public class ReverseEachWord {
	public static String reverseEachWord(String input) {
		// Write your code here
   String[] s = input.split(" ");
		
		String revS = "";

		for (int i = 0; i < s.length; i++) 
		{
			String w = s[i];
			String revW = "";

			
			for (int j = w.length()-1; j >= 0; j--) 
			{
				revW = revW + w.charAt(j);
			}
			
			revS = revS + revW + " ";
		}
		
		
		return revS;
		
	
}
}