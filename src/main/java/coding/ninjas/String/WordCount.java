package coding.ninjas.String;
public class WordCount
{ 
	public static void main(String args[])
	{ 
		String s = "welcome to coding ninjas  hh   java tutorial";
 
		int count = 1;	
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println( count);
 		
 		String arr[] =s.trim().split(" ");
 		int c=0;
 		for(String sss: arr) {
 			if(!sss.isEmpty()) {
 				c++;
 			}
 		}
 		System.out.println(c);
 		
	}
}
