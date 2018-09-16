package String2;
//Given a string, remove all the consecutive duplicates that are present in the given string. That means, if 'aaa' is present in the string then it should become 'a' in the output string.

public class RemoveConsecutive {
	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
String str="";
      char ch='1';
      for(int i=0;i<input.length();i++){
        if(ch!=input.charAt(i)){
          ch=input.charAt(i);
          str=str+ch;
        }
        
      }
      return str;
	}
}
