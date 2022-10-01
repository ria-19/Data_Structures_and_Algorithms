import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int val = 1;
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
