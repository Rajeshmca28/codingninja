package coding.ninjas.recurcion_2b;

public class ReturnKeyPad {
	public static void main(String[] args) {
	String[] res=keyPad(23);
	for(int i=0;i<res.length;i++) {
		System.out.println(res[i]);
	}
		
	}
public static String[] keyPad(int n) {
	if(n==0) {
		String[] str= {""};
		return str;
	}
	String[] s1=keyPad(n/10);
	String s=returnString(n%10);
	String[] output=new String[s.length()*s1.length];
	int count=0;
	for(int i=0;i<s1.length;i++)
	{
		for(int j=0;j<s.length();j++) {
			output[count++]=s1[i]+s.charAt(j);
		}
	}
	return output;
}
static String returnString(int n) {
String[] str= {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};	
return str[n];
}
}
