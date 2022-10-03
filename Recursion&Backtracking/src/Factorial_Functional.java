import java.util.Scanner;

public class Factorial_Functional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fact = f(n);
        System.out.println("Factorial: " + fact);
    }

    public static int f(int n){
        if (n == 0 || n == 1){
            return 1;
        }
        return n * f(n - 1);
    }
}
