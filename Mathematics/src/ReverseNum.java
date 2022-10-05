import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = f(n);
        if (rev != 0){
            System.out.println("Reverse: " + rev);
        }
    }

    private static int f(int n){
        int reverse = 0;

        while(n != 0){
            if (reverse < Integer.MAX_VALUE / 10 && reverse > Integer.MIN_VALUE / 10){
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }
            else{
                System.out.println("Integer OVERFLOW");
                return 0;
            }
        }
        return reverse;
    }
}
