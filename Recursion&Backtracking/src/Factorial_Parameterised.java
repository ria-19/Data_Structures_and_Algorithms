import java.util.Scanner;

public class Factorial_Parameterised {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        f(n, 1);
    }

    public static void f(int n, int fact){
        // Base Case
        if (n == 1 || n == 0){
            System.out.println("Factorial: " + fact);
            return;
        }
        f(n - 1, fact * n);
    }
}
