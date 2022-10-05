import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        f(n);
    }

    private static boolean isPrime(int x){
        boolean ans = true;
        if (x <= 1) ans = false;
        for(int i = 2; i * i <= x; i++){
            if (x %  i == 2) return false;
        }
        return ans;
    }

    private static void f(int n){

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        for(int i = 2; i * i <= n; i++){
            if (isPrime(i)){
                for(int j = i * i; j <= n; j = j + i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i = 2; i <= n; i++){
            if (isPrime[i]){
                System.out.print(i + " ");
            }
        }
    }


}
