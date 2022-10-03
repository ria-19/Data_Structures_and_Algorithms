import java.util.Scanner;
/*

   IMPORTANT!

*/

public class Pattern13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int icj = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(icj + " ");
                int icpj = (icj * (i - j)) / (j + 1);
                icj = icpj;
            }
            System.out.println();
        }
    }
}
