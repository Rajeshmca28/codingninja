package coding.ninjas.recurcion_1b;

public class PairStar {
	public static void main(String[] args) {
		String str="rajgdja";
		System.out.println(addStars(str));
	}
	public static String addStars(String s) {
		if (s.length() <= 1)
			return s;

		if (s.charAt(0) == s.charAt(1))
			return s.charAt(0) + "*" + addStars(s.substring(1)); 

		String str=s.charAt(0) + addStars(s.substring(1));
return str;
	}

}
