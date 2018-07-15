package coding.ninjas.String;

public class CompressDemo {

	public static void main(String[] args) {
		String s1 = "passaasssaaaassst";
		System.out.println(compressDemo(s1));

	}

	// }

	public static String compressDemo(String inputString) {
		int l = inputString.length();
		int count = 1;
		String s = "";
		String ss = "";
		for (int i = 0; i < l; i++) {
			if(i+1 == l) {
				s = s + inputString.charAt(i);
				break;
			}
			
			if ((i + 1 < l) && (inputString.charAt(i) == inputString.charAt(i + 1))) {

				count = count + 1;
				if (count > 0)
					s = inputString.charAt(i) + "" + count;

			} else {
				count = 1;
				if (s.isEmpty()) {
					ss = ss + inputString.charAt(i);
				} else {
					ss = ss + s;
				}
				s = "";
			}

		}

		if (!s.isEmpty()) {
			ss = ss + s;
		}

		return ss;
	}
}
