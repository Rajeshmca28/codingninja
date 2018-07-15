package coding.ninjas.recurcion;

public class PrintNNumber {
    public static void main(String[] args) {
        display(10);    
    }
     
    // print 1 to n
    private static void display(int n) {
        if (n > 1) {
            display(n - 1);
        }
        System.out.println(n);
    }
}