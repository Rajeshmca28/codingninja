package recursion3;
//Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

public class PairStar {
	public static String addStars(String s) {
		// Write your code here
		if (s.length() <= 1)
			return s;

		if (s.charAt(0) == s.charAt(1))
			return s.charAt(0) + "*" + addStars(s.substring(1));

		String str = s.charAt(0) + addStars(s.substring(1));
		return str;
	}
}
