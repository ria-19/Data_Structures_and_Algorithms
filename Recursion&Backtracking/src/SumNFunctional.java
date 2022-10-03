import java.util.Scanner;

/*
    Sum of N numbers --- Functional Recursion
 */
public class SumNFunctional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = f(n);
        System.out.println("Sum: "  + sum);
    }

    public static int f(int n){
        // Base Case
        if (n == 0){
            return 0;
        }

        return n + f(n - 1);
    }
}
