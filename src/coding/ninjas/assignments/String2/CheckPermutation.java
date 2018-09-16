package String2;
/*Given two strings, check if they are permutations of each other. Return true or false.
Permutation means - length of both the strings should same and should contain same set of characters. Order of characters doesn't matter.
Note : Input strings contain only lowercase english alphabets.
Input format :
Line 1 : String 1
Line 2 : String 2
*/
public class CheckPermutation {
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
    if (input1.length() != input2.length()) {
        return false;
    }

    for (int i = 0; i < input1.length(); i++) {
        char ch = input1.charAt(i);

        if (input2.indexOf(ch) == -1) 
            return false;
        else
            input2 = input2.replaceFirst(String.valueOf(ch), " ");
    }

    return true;
    }
}
