package main.java;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st = n;
        int sp = 0;

        for(int i = 1; i <= 2 * n; i++){
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            System.out.println();
            if (i < n){
                sp += 2;
                st--;
            }
            else if (i > n){
                sp -= 2;
                st++;
            }
        }
    }
}
