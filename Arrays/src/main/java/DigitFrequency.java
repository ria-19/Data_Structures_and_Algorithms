import java.util.Scanner;

public class DigitFrequency {
    public static int f(int x, int y){
        if (x == 0 && x == y) return 1;
        int count = 0;
        while(x > 0){
            int div = x % 10;
            if (div == y){
                count++;
            }
            x /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();

        int res = f(n, x);
        System.out.println("Frequency of " + x + " : " + res);
    }
}


