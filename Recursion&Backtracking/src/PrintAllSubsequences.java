import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllSubsequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> sequence = new ArrayList<>((int) Math.pow(2, n));
        f(0, sequence, n, arr);
    }

    private static void f(int ind, ArrayList<Integer> seq, int n, int[] arr){
        if (ind >= n){
            System.out.print(seq + " ");
            return;
        }

        // Take the element at index ind
        seq.add(arr[ind]);
        f(ind + 1, seq, n, arr);

        // Remove the element, for not taking the element at ind
        seq.remove((Integer) arr[ind]);
        f(ind + 1, seq, n, arr);
    }
}
