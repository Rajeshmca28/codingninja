package coding.ninjas.recurcion_1a;

public class SumOfDigit {
	public static void main(String[] args) {
		System.out.println(sumOfDigits(234));
	}
	public static int sumOfDigits(int n){
        int sum;
        if(n < 10){
            return n;
        }
        sum = (n % 10) + sumOfDigits(n / 10);
        return sum;
}
}
