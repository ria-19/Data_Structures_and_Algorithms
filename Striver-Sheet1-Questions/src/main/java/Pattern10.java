package main.java;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int row = 1;
        for(int i = 1; i <= 2 * n - 1; i++){
            for(int j = 1; j <= row; j++){
                System.out.print(row + "\t");
            }

            System.out.println();

            if (i < n){
                row++;
            }
            else{
                row--;
            }
        }
    }

}
