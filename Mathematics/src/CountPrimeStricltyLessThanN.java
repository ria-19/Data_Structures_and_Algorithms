import java.util.Arrays;
import java.util.Scanner;

public class CountPrimeStricltyLessThanN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n <= 2){
            System.out.println(0);
            return;
        }
        int ans = f(n);
        System.out.println(ans);
    }

    private static int f(int n){
        int[] isPrime = new int[n + 1];

        Arrays.fill(isPrime, 1);
        isPrime[0] = 0; isPrime[1] = 0;

        for(int i = 2; i * i <= n; i++){
            if (isPrime[i] == 1){
                for(int j = i * i; j <= n; j = j + i){
                    isPrime[j] = 0;
                }
            }
        }

        for(int i = 3; i <= n; i++){
            isPrime[i] = isPrime[i - 1] + isPrime[i];
        }

        return isPrime[n - 1];
    }
}
