import java.util.Scanner;

public class BaseToDecimal {
    private static void f(int b, int n){
        int val = 0;
        int multi = 1;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            val += rem * multi;
            multi *= b;
        }

        System.out.println("Base: " + b + " to 10 -> " + val);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int n = in.nextInt();
        f(b, n);
    }
}
