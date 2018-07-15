package coding.ninjas.recurcion_1b;

public class ConvertStringToInteger {
	public static void main(String[] args) {
		String str="rajgdja";
		System.out.println(convertString2Int(str));
	}
	public static int convertString2Int(String input){
     if(input.length()==0)
    {
        return 0;
    }
    char ch = input.charAt(0);
    String str = input.substring(1);

    int f=1;
    for(int i=0;i<input.length()-1;i++)
        f*=10;

    f=f*(ch-'0');
    int res=f+convertString2Int(str);
return res;
	}
}
