import java.util.Scanner;

public class AnyBasetoAnyBase {
    private static void f(int b1, int b2, int n){
        int val = 0;
        int multi = 1;
        while(n > 0){
            int rem = n % b2;
            n = n / b2;

            val += (rem * multi);
            multi *= b1;
        }
        System.out.println("Base:" + b1 + " to Base:" + b2 + " -> " + val);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        f(b1, b2, n);
    }
}
