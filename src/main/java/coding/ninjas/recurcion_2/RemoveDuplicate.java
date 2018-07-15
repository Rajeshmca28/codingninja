package coding.ninjas.recurcion_2;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str="rajgdja";
		System.out.println(removeConsecutiveDuplicates(str));
	}
	public static String removeConsecutiveDuplicates(String s) {
    if ( s.length() <= 1 )
      return s;
    if( s.substring(1,2).equals(s.substring(0,1)) )
      return removeConsecutiveDuplicates(s.substring(1));
    else return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(1));
}

}
