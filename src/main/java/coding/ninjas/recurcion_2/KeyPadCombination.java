package coding.ninjas.recurcion_2;

import java.util.Scanner;

public class KeyPadCombination {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(keypad(n));
	}
	 public static String[] keypad(int n){

				if (n == 0) {
				String[] arr = { "" };
				return arr;
			}

			String[] smallAns = keypad(n / 10);

			String words = mapping(n % 10);

			String[] result = new String[words.length() * smallAns.length];
			int k = 0;
			for (int i = 0; i < words.length(); i++) {
				for (int j = 0; j < smallAns.length; j++) {
					result[k++] = smallAns[j] + words.charAt(i);
				}
			}
			return result;
		}
	  	static String mapping(int i) {

			String arr[] = { "", "", "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz" };
			return arr[i];
	    }

}
