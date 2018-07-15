package coding.ninjas.recurcion;

public class PrintKeyPad {
	static void printkeypad(int num, String str) {
		if (num == 0) {
			System.out.println(str);
			return;
		}
		String test = mapping(num % 10);
		for (int i = 0; i < test.length(); i++) {
			printkeypad(num / 10,  str+test.charAt(i) );
		}
	}

	static String mapping(int i) {

		String arr[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		return arr[i];
	}

	public static void main(String[] args) {

		printkeypad(92, "");
	}
}
