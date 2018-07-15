package coding.ninjas.recurcion_1b;

public class TowerOfHanoi {
	public static void towerHanoi(char src,char helper,char dest,int n) {
		if(n==0) {
			return;
		}
		towerHanoi(src,dest,helper,n-1);
		System.out.println(n+" "+src+" "+dest);
		towerHanoi(helper,src,dest,n-1);
	}
	public static void main(String[] args) {
		towerHanoi('A','B','C',4);
	}

}
