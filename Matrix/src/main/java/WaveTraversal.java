import java.util.Scanner;

public class WaveTraversal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        int[][] a = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                a[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i < c; i++){
            if (i % 2 == 0){
                for(int j = 0; j < r; j++){
                    System.out.print(a[j][i] + "\t");
                }
            }
            else{
                for(int j = r - 1; j >= 0; j--){
                    System.out.print(a[j][i] + "\t");
                }
            }
        }


    }
}
