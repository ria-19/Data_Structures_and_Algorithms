package main.java;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
