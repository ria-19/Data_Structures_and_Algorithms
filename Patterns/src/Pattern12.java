import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0, b = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println();
        }
    }
}
