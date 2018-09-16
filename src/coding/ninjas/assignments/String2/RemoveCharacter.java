package String2;

import java.util.LinkedHashMap;

/*Given a string and a character x. Write a function to remove all occurrences of x character from the given string.
Leave the string as it is, if the given character is not present in the string.
Input format :

Line 1 : Input string

Line 2 : Character x

*/
public class RemoveCharacter {
	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
     String s = "";

    for (int i = 0; i < input.length(); i++){
        if (input.charAt(i) != c){
            s += input.charAt(i);
        }
    }
    LinkedHashMap<Integer,Integer>l=new LinkedHashMap<>();

    return s;
  }
}
