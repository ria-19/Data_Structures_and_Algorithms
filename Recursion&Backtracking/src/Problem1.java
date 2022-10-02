import java.util.Scanner;

/*
        Print Name, N times using Recursion
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(1, n);
    }

    public static void func(int i, int n){

        // Base Condition
        if (i > n){
            return;
        }

        System.out.println("Hey there!");
        func(i + 1, n);
    }
}
