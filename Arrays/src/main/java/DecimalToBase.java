import java.util.Scanner;

public class DecimalToBase {
    public static void f(int n, int b){
        int mult = 1;
        int val = 0;
        while(n > 0){
            int rem = n % b;
            val += rem * mult;
            mult *= 10;
            n = n / b;
        }

        System.out.println("10 -> " + b + " : " + val);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int b = in.nextInt();
        f(n, b);
    }
}
