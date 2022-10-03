package main.java;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            int value = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(value + "\t");
                value++;
            }
            System.out.println();
        }
    }
}
