package Programing_Fundamental_4;

import java.util.Scanner;

//Given a binary number as an integer N, convert it into decimal and print.

public class BinaryToDecimal {
	public static void main(String[] args) {
		// Write your code here
	Scanner s=new Scanner(System.in);
    String num =s.nextLine();  
    System.out.println(binaryToDecimal(num));
}

	static int binaryToDecimal(String n)
    {
        String num = n;
        int dec_value = 0;
     
        int base = 1;
     
        int len = num.length();
        for (int i = len - 1; i >= 0; i--)
        {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
     
        return dec_value;
    }
}
