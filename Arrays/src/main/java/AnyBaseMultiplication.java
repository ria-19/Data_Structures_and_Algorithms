import java.util.Scanner;

public class AnyBaseMultiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int res = f(b, n1, n2);
        System.out.println(n1 + " x " + n2 + " with base " + b + " = " + res);

    }

    public static int f(int b, int n1, int n2){
        int multi = 1;
        int val = 0;

        while(n2 > 0){
            int d2 = n2 % 10;
            n2 /= 10;

            int sPrd = M(b, n1, d2);

            sPrd *= multi;
            val += A(b, val, sPrd);

            multi *= 10;
        }
        return val;
    }

    public static int M(int b, int n1, int d1) {

        int val = 0;
        int c = 0;
        int multi = 1;

        while(n1 > 0 || c > 0){
            int d2 = n1 % 10;
            n1 /= 10;

            int d = d1 * d2 + c;

            c = d / b;
            d = d % b;

            val += d * multi;
            multi *= 10;
        }
        return val;
    }

    private static int A(int b, int n1, int n2){
        int c = 0;
        int val = 0;
        int multi = 1;
        while(n1 > 0 || n2 > 0 || c > 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int r = r1 + r2 + c;
            c = r / b;
            r = r % b;
            val += r * multi;
            multi *= 10;
        }

        return val;
    }
}
