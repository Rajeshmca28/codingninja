package coding.ninjas.String;

public class PermutationDemo {

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
		public static void main(String[] args) {
			String str1="abcde";
			String str2="baedc";
			//System.out.println(isPermutation(str1,str2));
			//System.out.println(str2.replaceFirst("c", ""));
		}
	}
