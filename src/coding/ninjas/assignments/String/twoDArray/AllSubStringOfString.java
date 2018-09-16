package String.twoDArray;
/*Given a String S of length n, print all its substrings.
Substring of a String S is a part of S (of any length from 1 to n), which contains all consecutive characters from S.
Input Format :
String S
*/
public class AllSubStringOfString {
	public static void printSubstrings(String str){
		
		
      String sub="";
for (int i = 0; i < str.length(); i++)
      {
         for(int j = 1; j <= str.length()- i; j++)
         {
            sub = str.substring(i, i+j);
            System.out.println(sub);
         }
      }
	}
}
