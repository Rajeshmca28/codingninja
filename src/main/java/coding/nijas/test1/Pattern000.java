package coding.nijas.test1;
import java.util.Scanner;
public class Pattern000 {
	public static void main(String[] args) {
		
	
	 Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		
	      int i,j,k;
		for (i=1;i<=n;i++){
			for (j=1;j<=n*2+1;j++) {
				if(j==i || j==n+1 || n*2+2-j==i) {
				        System.out.print("*");
				}else {
				        System.out.print("0");
			}}
			System.out.println("");
		}
		}	
}
