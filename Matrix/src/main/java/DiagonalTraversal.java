import java.util.Scanner;

public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }

        for(int g = 0; g < a.length; g++){
            for(int i = 0, j = g; j < a.length; i++, j++){
                System.out.print(a[i][j] + "\t");
            }
        }


    }
}
