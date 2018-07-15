package coding.ninjas.recurcion_1a;

public class CountZero {
	public static void main(String[] args) {
		System.out.println(countZerosRec(2340));
	}
	public static int countZerosRec(int input){
	     if(input == 0)
	       return 0;

	    if(input %10 ==0)
	        return 1 + countZerosRec(input / 10);
	    else
	        return countZerosRec(input/10); 
}
}
