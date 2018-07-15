package coding.ninjas.recurcion_1b;

public class RemoveX {
	public static void main(String[] args) {
		String str="rajgdja";
		System.out.println(removeX(str));
	}
	public static String removeX(String input){
 String result = "";
 
      if (input == null || input.trim().length() == 0)
   
        return result;
  String str = input.substring(0, 1);
  input = input.substring(1);
  if (!(str.equals("x"))) {
   result = str;
  }
  return result + removeX(input);

	}

}
