public class subSets {

	public static void main(String[] args) {

		String test = "ABC";

		subSet(test, test.length());

	}

	public static void subSet(String a, int n) {

		String prefix = "";

		if (n == 0) {

			return;

		}

		else

			for (int i = 1; i < n; i++) {

				prefix += a.charAt(i);

			}

		System.out.println(prefix + a.charAt(0));

		subSet(a, n - 1);

		subSet(prefix, n - 1);

		return;

	}
}
