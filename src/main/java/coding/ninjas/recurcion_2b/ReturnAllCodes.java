package coding.ninjas.recurcion_2b;

public class ReturnAllCodes {
	public static void main(String[] args) {
		String str = "1123";
		String[] s = getCode(str);
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	public static String[] getCode(String input) {
		int l = input.length();
		if (l <= 0) {
			String[] s = { "" };
			return s;
		}
		if (l == 1) {
			String s1 = "" + getAlpha(input.charAt(0));
			String[] sr = { s1 };
			return sr;
		}
		String[] r1 = getCode(input.substring(1));
		{
			String[] r2 = getCode(input.substring(2));
			int c = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
			if (c > 9 && c < 27) {
				String[] ans = new String[r1.length + r2.length];
				for (int i = 0; i < r1.length ; i++) {
					ans[i] = getAlpha(input.charAt(0)) + r1[i];

				}
				for (int i = 0; i < r2.length; i++) {
					{
						ans[i + r1.length] = getAlpha(c + '0') + r2[i];
					}
				}

				return ans;
			} else {
				String[] ans = new String[r1.length];
				for (int i = 0; i < r1.length; i++) {
					ans[i] = getAlpha(input.charAt(0)) + r1[i];
				}
				return ans;
			}

		}

	}

	public static char getAlpha(int k) {
		return (char) ('a' + k - 1 - '0');
	}
}
