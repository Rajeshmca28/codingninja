package String2;
/*Given a string, find and return the highest occurring character present in the given string.
If there are 2 characters in the input string with same frequency, return the character which comes first.
Note : Assume all the characters in the given string are lowercase.
*/
public class HighestOccuringCharacter {
	public static char highestOccuringCharacter(String str) {
		
	      char ch='1';
	      int count=0;
	      int mcount=Integer.MIN_VALUE;
	      for(int i=0;i<str.length();i++){
	        for(int j=0;j<str.length();j++){
	          if(str.charAt(i)==str.charAt(j)){
	            count++;
	          }
	          if(count>mcount){
	            mcount=count;
	            ch=str.charAt(i);
	          }
	        }
	        count=0;
	      }
	  return ch;
	    }
}
