/*
        Print N -> 1 , using Recursion
 */

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

    public static void func(int i){
        if (i < 1){
            return;
        }
        System.out.print(i  + " ");
        func(i - 1);
    }
}
