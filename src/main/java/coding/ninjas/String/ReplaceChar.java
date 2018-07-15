package coding.ninjas.String;

class ReplaceChar {
	public static String replaceDemo(String s, char c1, char c2) {
		int l = s.length();
		char arr[] = s.toCharArray();

		for (int i = 0; i < l; i++) {
			if (arr[i] == c1) {
				arr[i] = c2;
		/*	} else if (arr[i] == c2) {
				arr[i] = c1;
			}
		
		*/
		/*for (int i = 0; i < l-1; i++) {
			if (s.charAt(i) == c1) {
		*/
/*				s = s.replace(s.charAt(i), c2);
			} else if (s.charAt(i) == c2) {
					s = s.replace(s.charAt(i), c1);
		
*/				
				//break;

			}

		
		}
		String ss = String.valueOf(arr);
		return ss;
	}

	public static void main(String[] args) {
		String s = "vyyvy";
		char c1 = 'y', c2 = 'v';
		System.out.println(replaceDemo(s, c1, c2));
	}
}
