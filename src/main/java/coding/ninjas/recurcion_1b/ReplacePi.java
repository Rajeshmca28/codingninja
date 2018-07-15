package coding.ninjas.recurcion_1b;

public class ReplacePi {
	public static void main(String[] args) {
		String str="rajgdja";
		System.out.println(replace(str));
	}
	public static String replace(String input){
  if (input.equals("") || input.length() < 2) 
    return input;

  if (input.charAt(0) == 'p' && input.charAt(1) == 'i')

    return "3.14" + replace(input.substring(2));

  String str= input.charAt(0) + replace(input.substring(1));
return str;
}
}
