import java.util.Scanner;

public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r1 = in.nextInt();
        int c1 = in.nextInt();

        int[][] a = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                a[i][j] = in.nextInt();
            }
        }


        int r2 = in.nextInt();
        int c2 = in.nextInt();

        int[][] b = new int[r2][c2];
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                b[i][j] = in.nextInt();
            }
        }

        if (c1 != r2){
            System.out.println("Invalid");
            return;
        }

        int[][] c =  new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < r2; k++){
                    c[i][j] += a[i][k] + b[k][j];
                }
            }
        }

        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
