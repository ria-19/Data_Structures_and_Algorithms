import java.util.Scanner;

public class AnyBaseSub {
    private static int f(int b, int n2, int n1){
        int val = 0;
        int c = 0;
        int multi = 1;
        while(n2 > 0){
            int r1 = n1 % 10;
            n1 /= 10;
            int r2 = n2 % 10;
            n2 /= 10;

            r2 = r2 + c;

            if (r2 < r1){
                c = -1;
                r2 = r2 + b;
            }
            else{
                c = 0;
            }

            val += (r2 - r1) * multi;
            multi *= 10;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int n2 = in.nextInt();
        int n1 = in.nextInt();

        int val = f(b, n2, n1);
        System.out.println("Subtraction of " + n1 + " from " + n2 + " = " + val + " with base " + b);
    }
}
