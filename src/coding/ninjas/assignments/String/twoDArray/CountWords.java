package String.twoDArray;
/*Given a string S, count number of words in the string.
Note : Assume there is single space between two words and there are no extra spaces before and after words.
Input Format :
 String S
*/
public class CountWords {
	public static int countWords(String str){
		
		
int count =1;
      for(int i=0;i<str.length();i++){
        if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' '))
           {
             count++;
           }
      
           	}
      return count;
    }	
}
