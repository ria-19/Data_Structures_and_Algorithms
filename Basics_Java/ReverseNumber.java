import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n != 0){
            System.out.print(n % 10);
            n = n / 10;
        }
    }
}
