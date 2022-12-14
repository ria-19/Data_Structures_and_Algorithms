/*
    Print 1 - N, with Backtracking concept
 */
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n, n);
    }

    public static void func(int i, int n){
        // Base Case
        if (i < 1){
            return;
        }
        func(i - 1, n);
        System.out.print(i + " ");
    }
}
