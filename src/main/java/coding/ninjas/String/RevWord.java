package coding.ninjas.String;
//Java program to reverse individual 
//words in a given string using STL list
import java.util.*;

public class RevWord
{
	static void reverseEachWord(String str)
	{
		String[] s = str.split(" ");
		
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
		
		System.out.println(str);
		
		System.out.println(revS);
		
	}
	
    public static void main(String[] args) 
    {
		reverseEachWord("Java Concept Of The Day");
		
		
	}
}
