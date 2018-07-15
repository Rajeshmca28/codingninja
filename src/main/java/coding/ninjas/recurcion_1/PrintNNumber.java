package coding.ninjas.recurcion_1;

public class PrintNNumber {
    public static void main(String[] args) {
        display(10);    
    }
     
    private static void display(int n) {
        if (n > 1) {
            display(n - 1);
        }
        System.out.println(n);
    }
}