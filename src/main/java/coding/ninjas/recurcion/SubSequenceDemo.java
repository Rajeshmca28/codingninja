package coding.ninjas.recurcion;

public class SubSequenceDemo {

	public static void main(String[] args) {
		// Write your code here
      String res="abcd";
        subSequence(res,"");
	}
  
static	void subSequence(String input, String resultSoFar){
		if(input.length()==0){
			System.out.println(resultSoFar);
			return;
		}
		subSequence(input.substring(1), resultSoFar);
		subSequence(input.substring(1), resultSoFar+input.charAt(0));
	}
	
}
