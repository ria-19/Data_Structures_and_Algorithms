import java.util.Scanner;

public class AnyBaseAddition {
    private static int f(int b, int n1, int n2){
        int c = 0;
        int val = 0;
        int multi = 1;
        while(n1 > 0 && n2 > 0){
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;

            int r = r1 + r2 + c;
            c = r / b;
            r = r % b;
            val = val + r * multi;
            multi *= 10;
        }

        if (c > 0){
            val += c * multi;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int val = f(b, n1, n2);
        System.out.println(n1 + " + " + n2 + " with base " + b + " : " + val);
    }
}
