import java.util.ArrayList;
import java.util.Scanner;

public class CountSubsequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int sum = in.nextInt();
        System.out.println("Count: " + f(0, arr, sum, 0));
    }

    public static int f(int i, int[] arr, int sum, int s){
        if (i >= arr.length){
            if (sum == s){
                return 1;
            }
            return 0;
        }

        s += arr[i];
        int l = f(i + 1, arr, sum, s);

        s -= arr[i];
        int r = f(i + 1, arr, sum, s);

        return l + r;
    }
}
