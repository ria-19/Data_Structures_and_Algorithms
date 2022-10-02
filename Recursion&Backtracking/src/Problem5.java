import java.util.Scanner;

/*
    Print N to 1, using Backtracking Concept
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(1, n);
    }

    public static void func(int i, int n){
        if (i > n){
            return;
        }
        func(i + 1, n);
        System.out.print(i + " ");
    }
}
