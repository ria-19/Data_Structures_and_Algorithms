import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int op = 1;
        int inv = 0;
        while( n != 0){
            int od = n % 10;
            int id = op;
            int ip = od;

            inv = inv + id * (int) Math.pow(10, ip - 1);

            op++;
            n = n / 10;
        }
        System.out.println(inv);
    }
}
