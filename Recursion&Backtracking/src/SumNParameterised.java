/*
    Sum of N numbers --- Parameterised Recursion
 */

import java.util.Scanner;

public class SumNParameterised {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        f(n, 0);
    }

    public static void f(int n, int sum){
        // Base Case
        if (n < 1){
            System.out.println("Sum: " + sum);
            return;
        }

        f(n - 1, sum + n);
    }
}


