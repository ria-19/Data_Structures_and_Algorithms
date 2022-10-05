import java.util.Scanner;

public class FibonacciRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans = f(n);
        System.out.println(n + "th Fibonacci Number is: " + ans);
    }

    private static int f(int n){
        if (n <= 1) return n;
        return f(n - 1) + f(n - 2);
    }
}
