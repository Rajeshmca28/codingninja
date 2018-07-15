package coding.ninjas.recurcion;

public class ReturnPermutation {
	public static void main(String[] args) {
		String str="abc";
		String[] str1=permutationOfString(str);
		for(int i=0;i<str1.length;i++) {
			System.out.println(str1[i]);
		}
	}
	public static String[] permutationOfString(String input){
		if (input.length() == 0) {
			String[] arr = { "" };
			return arr;
		}
		String[] smallAns = permutationOfString(input.substring(1));
		String[] ans = new String[smallAns.length * (smallAns[0].length() + 1)];

		int k = 0;
		for (int i = 0; i < smallAns.length; i++) {
			String word = smallAns[i];
			for (int j = 0; j <= word.length(); j++) {
				ans[k++] = word.substring(0, j) + input.charAt(0)
						+ word.substring(j);
			}
		}

		return ans;
	}
}
