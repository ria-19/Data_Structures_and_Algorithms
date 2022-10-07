import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSumK {
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

    public static void f(int ind, ArrayList<Integer> seq, int[] arr, int sum, int s){
        if (ind >= arr.length){
            if (sum == s){
                System.out.println(seq);
            }
            return;
        }

        seq.add(Integer.valueOf(arr[ind]));
        s += arr[ind];
        f(ind + 1, seq, arr, sum, s);

        seq.remove(Integer.valueOf(arr[ind]));
        s -= arr[ind];
        f(ind + 1, seq, arr, sum, s);

    }

}
