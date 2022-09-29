import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int digits = 0;
        while(n != 0){
            n = n / 10;
            digits++;
        }

        System.out.println(digits);
    }
}
