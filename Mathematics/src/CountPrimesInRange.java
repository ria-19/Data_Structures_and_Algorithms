import java.util.Arrays;
import java.util.Scanner;

public class CountPrimesInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        if (R < 2){
            System.out.println(0);
            return;
        }
        int ans = f(L, R);
        System.out.println(ans);
    }

    private static int f(int L, int R){
        int[] isPrime = new int[R + 1];

        Arrays.fill(isPrime, 1);
        isPrime[0] = 0; isPrime[1] = 0;

        for(int i = 2; i * i <= R; i++){
            if (isPrime[i] == 1){
                for(int j = i * i; j <= R; j = j + i){
                    isPrime[j] = 0;
                }
            }
        }

        for(int i = 3; i <= R; i++){
            isPrime[i] = isPrime[i - 1] + isPrime[i];
        }

        return isPrime[R] - isPrime[L - 1];
    }
}
