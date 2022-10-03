package main.java;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = n;
        int st = 1;
        for(int i = 1; i <= n; i++){
            int val = 'A';
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print((char) val + "\t");
                if (j <= (st / 2)){
                    val++;
                }
                else{
                    val--;
                }
            }

            System.out.println();

            st += 2;
            sp--;
        }
    }

}
