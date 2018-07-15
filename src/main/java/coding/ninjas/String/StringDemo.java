package coding.ninjas.String;

public class StringDemo {
public static void main(String[] args) {
	String str="hello";
	printEachChar(str);
}
public static void printEachChar(String input) {
	for(int i=0;i<input.length();i++)
		System.out.println(input.charAt(i));
}
}
