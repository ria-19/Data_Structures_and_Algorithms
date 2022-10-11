import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = insertIntoArray();

        System.out.println("Original Array ---> ");
        System.out.println(Arrays.toString(arr));

        int l = 0;
        int r = arr.length - 1;

        while(l < r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }

        System.out.println("Reversed Array ---> ");
        System.out.println(Arrays.toString(arr));
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
