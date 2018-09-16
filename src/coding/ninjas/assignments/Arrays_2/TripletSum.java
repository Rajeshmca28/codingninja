package Arrays_2;
/*Given a random integer array and a number x. Find and print the triplets of elements in the array which sum to x.
While printing a triplet, print the smallest element first.
That is, if a valid triplet is (6, 5, 10) print "5 6 10". There is no constraint that out of 5 triplets which have to be printed on 1st line. You can print triplets in any order, just be careful about the order of elements in a triplet.
Input format :
Line 1 : Integer N (Array Size)
Line 2 : Array elements (separated by space)
Line 3 : Integer x
*/
public class TripletSum {
public static void main(String[] args) {
	int[] arr= {1 ,2 ,3 ,4 ,5 ,6 ,7 };
	int n=		12;
	FindTriplet(arr,n);
}
	public static void FindTriplet(int[] arr, int x){
	int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
int a=0;
int b=0;
int c=0;
			
for (a = 0; a < arr.length - 2; a++) 
	for (b = a + 1; b < arr.length - 1; b++) 
	for (c = b + 1; c < arr.length; c++) 
										
		
	if (arr[a] + arr[b] + arr[c] == x) {
		if (arr[a] < arr[b] && arr[b] < arr[c]) {
			System.out.println(arr[a] + " " + arr[b] + " " + arr[c]);
		} else if (arr[b] < arr[a] && arr[b] < arr[c]) {
			System.out.println(arr[b] + " " + arr[a] + " " + arr[c]);
		} else {
					System.out.println(arr[a] + " " + arr[b] + " " + arr[c]);

		}
	}
}
}
