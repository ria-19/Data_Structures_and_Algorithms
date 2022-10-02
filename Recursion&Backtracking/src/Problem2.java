import java.util.Scanner;

/*
    Print linearly from 1 to N
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(1, n);
    }

    public static void func(int i, int n){
        if (i > n){
            return;
        }
        System.out.print(i + " ");
        func(i + 1, n);
    }
}
