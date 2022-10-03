package main.java;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int st = 1;
        int sp = 2 * (n - 1);

        for(int i = 1; i <= 2 * n - 1; i++){
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
                sp -= 2;
                st++;
            }
            else {
                sp += 2;
                st--;
            }
        }
    }

}
