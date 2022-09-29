import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0, b = 1;
        for(int i = 1; i <= n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
