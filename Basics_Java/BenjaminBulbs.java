import java.util.Scanner;

public class BenjaminBulbs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i * i <= n; i++){
            System.out.println(i * i);
        }
    }
}
