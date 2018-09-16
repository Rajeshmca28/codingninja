package Programming_Fundamentals_1;

import java.util.Scanner;
//Write a program to determine whether the entered character is in uppercase or lowercase, or is an invalid character.

public class FindCharacterCase {
	public static void main(String[] args) {
		// Write your code here

      Scanner s=new Scanner(System.in);
		char c=s.next().charAt(0);
    charCase(c);
    }
      public static void charCase(char c){
      int ch=(int)c;
		
		if(ch>='A'&&ch<='Z') {
			System.out.println(1);		
		}else
	
			if(ch>='a'&&ch<='z') {
				System.out.println(0);
			}else
				System.out.println(-1);


	}

}
