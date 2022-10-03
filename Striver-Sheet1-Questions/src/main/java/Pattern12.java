package main.java;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int C = 'A';
            for(int j = 0; j <= i; j++){
                System.out.print((char) C);
                C++;
            }
            System.out.println();
        }
    }
}
