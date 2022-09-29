import java.util.Scanner;

public class DigitsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Count digits -- > divisor == math.pow(n, nod - 1)
        int temp = n;
        int nod = 0;
        while(temp != 0){
            temp /= 10;
            nod++;
        }

        int div = (int) Math.pow(10, nod - 1);

        // Important --> n!= 0 will not work for number with last digits as 0
        while(div != 0){
            System.out.println(n / div);
            n = n % div;
            div /= 10;
        }
    }
}
