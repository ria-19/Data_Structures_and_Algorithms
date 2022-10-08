import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int[] a1 = insertIntoArray();
        int[] a2 = insertIntoArray();

        int n1 = a1.length;
        int n2 = a2.length;

        int[] sum = new int[n1 > n2 ? n1 : n2];
        int c = 0;

        int i = n1 - 1;
        int j = n2 - 1;
        int k = sum.length - 1;

        while(k >= 0){
            int d = c;

            if (i >= 0){
                d += a1[i];
            }

            if(j >= 0){
                d += a2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d;

            k--;
            i--;
            j--;
        }

        if (c != 0){
            System.out.print(c + " ");
        }

        for(int val: sum){
            System.out.print(val + " ");
        }
    }

    public static int[] insertIntoArray(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        return arr;
    }

}
