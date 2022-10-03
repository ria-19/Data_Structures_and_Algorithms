package main.java;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = n; i >= 1; i--){
            int C = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print((char) C);
                C++;
            }
            System.out.println();
        }
    }
}
