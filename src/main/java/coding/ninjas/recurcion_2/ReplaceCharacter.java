package coding.ninjas.recurcion_2;

public class ReplaceCharacter {
	public static void main(String[] args) {
		String str="rajgdja";
		char c1='a';
		char c2='g';
		System.out.println(replaceCharacter(str,c1,c2));
	}
	public static String replaceCharacter(String input, char c1, char c2) {

	int l = input.length();
	char arr[] = input.toCharArray();

	for (int i = 0; i < l; i++) {
		if (arr[i] == c1) {
			arr[i] = c2;

		}

	
	}
	String ss = String.valueOf(arr);
	return ss;
	}
}
