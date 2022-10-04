import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        // Input for Array Elements
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println("Original === >");
        System.out.println(Arrays.toString(arr));

        // Approach 1
        f1(0, n - 1, arr);
        System.out.println("Reversed === >");
        System.out.println(Arrays.toString(arr));

//         Approach 2
        f2(0, arr);
        System.out.println("Reversed Again === >");
        System.out.println(Arrays.toString(arr));

    }

    private static void f2(int i, int[] arr) {
        int n = arr.length;
        if (i >= (n  / 2)) return;

        int tmp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = tmp;

        f2(i + 1, arr);
    }

    private static void f1(int l, int r, int[] arr){
        if (l >= r) return;
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
        f1(l + 1, r - 1, arr);
    }
}
