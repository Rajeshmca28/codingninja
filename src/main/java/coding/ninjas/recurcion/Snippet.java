package coding.ninjas.recurcion;

import java.util.Scanner;

public class Snippet {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sPrint(n);
	}
	public static void sPrint(int n){
			if(n == 1){
				System.out.print(n + " ");
				return;
			}
			System.out.print(n+" ");
			sPrint(n-1);
		}
	
	}


