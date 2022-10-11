import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        int[] arr = insertIntoArray();
        System.out.println("Original Array ---> ");
        System.out.println(Arrays.toString(arr));

        int n = arr.length;
        int[] inv = new int[n];

        for(int i = 0; i < n; i++){
            int v = arr[i];
            inv[v] = i;
        }

        System.out.println("After Inverse ---> ");
        System.out.println(Arrays.toString(inv));
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
