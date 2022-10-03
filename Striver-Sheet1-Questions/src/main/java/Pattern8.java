package main.java;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = 0;
        int st = 2 * n -1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }

            System.out.println();

            st -= 2;
            sp++;
        }
    }

}
