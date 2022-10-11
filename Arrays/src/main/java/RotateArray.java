import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = insertIntoArray();
        System.out.println("Original Array -->");
        System.out.println(Arrays.toString(arr));

        int k = in.nextInt();

        int n = arr.length;
        k = k % n;
        if (k < 0){
            k = k + n;
        }

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);

        System.out.println("Reversed Array -->");
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int l, int r){
        while(l < r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
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
