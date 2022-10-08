import java.util.ArrayList;
import java.util.Scanner;

public class PrintOneSubSeqWithKSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int sum = in.nextInt();
        ArrayList<Integer> sequence = new ArrayList<>((int) Math.pow(2, n));
        f(0, sequence, arr, sum, 0);
    }

    public static boolean f(int i, ArrayList<Integer> seq, int[] arr, int sum, int s){
        if (i >= arr.length){
            if (sum == s){
                System.out.println(seq);
                return true;
            }
            return false;
        }

        seq.add(Integer.valueOf(arr[i]));
        s += arr[i];
        if (f(i + 1, seq, arr, sum, s) == true) return true;

        seq.remove(Integer.valueOf(arr[i]));
        s -= arr[i];
        if (f(i + 1, seq, arr, sum, s) == true) return true;

        return false;
    }


}
