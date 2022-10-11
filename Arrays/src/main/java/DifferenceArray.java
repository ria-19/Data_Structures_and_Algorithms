import java.util.Scanner;

public class DifferenceArray {
    public static void main(String[] args) {
        int[] a2 = insertIntoArray();
        int[] a1 = insertIntoArray();

        int n2 = a2.length;
        int n1 = a1.length;

        int[] diff = new int[n2];
        int b = 0;

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n2 - 1;

        while(k >= 0){
            int d = 0;

            // for handling uneven length arrays
            int a1v = i >= 0 ? a1[i] : 0;

            if (a2[j] + b >= a1v){
                d = a2[j] + b - a1v;
                b = 0;
            }
            else{
                d = a2[j] + b + 10 -a1v;
                b = -1;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        // For preceding zeros
       int idx = 0;
        while(idx < diff.length){
            if (diff[idx] != 0){
                break;
            }
            idx++;
        }

        while(idx < diff.length){
            System.out.print(diff[idx] + " ");
            idx++;
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
