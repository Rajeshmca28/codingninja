package coding.ninjas.recurcion;

public class PrintAllCodes {
	     
public static void main(String[] args)
	{
	String str="1123";
	
	 
	 
getCode(str,"");
	}
static char mapping(int n){
char c=(char)('a'+n-1);
	return c;
}
public static void getCode(String input,String result){
if(input.length()==0){
  System.out.println(result);
  return;
}
getCode(input.substring(1),result+mapping(Character.getNumericValue(input.charAt(0))));
if(input.length()>1){
  int m=Integer.parseInt(input.substring(0,2));
  if(m<=26){
        getCode(input.substring(2),result+mapping(m));
  }

}
}
}