package coding.ninjas.String;

public class PrintSubString {
	public static void main(String[] args) {
	String s="raj";
	printSubStringDemo(s);
	}
static	void printSubStringDemo(String str) 
	{
	
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
