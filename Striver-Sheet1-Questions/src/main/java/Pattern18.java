package main.java;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (i == 1 || i == n){
                    System.out.print("*\t");
                }
                else{
                    if (j == 1 || j == n){
                        System.out.print("*\t");
                    }
                    else{
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}
