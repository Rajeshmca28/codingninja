package coding.ninjas.recurcion_1a;

import java.util.Scanner;

public class GeometricSum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(findGeometricSum(n));
	}
	public static double findGeometricSum(int k){
if(k==0)
{
  return 1;
}
      return (1/Math.pow(2,k))+findGeometricSum(k-1);
	}
}
