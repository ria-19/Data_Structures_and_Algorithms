package main.java;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int st = 1;
        int sp = 2 * (n - 1);

        for(int i = 1; i <= n; i++){
            int val = 1;
            for(int j = 1; j <= st; j++){
                System.out.print(val + "\t");
                val++;
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                val--;
                System.out.print(val + "\t");
            }

            System.out.println();
            st++;
            sp -= 2;
        }
    }
}
