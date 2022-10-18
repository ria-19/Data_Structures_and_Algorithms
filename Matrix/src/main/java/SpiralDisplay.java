import java.util.Scanner;

public class SpiralDisplay {
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

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        int left = 0;
        int right = c - 1;

        int top = 0;
        int bottom = r - 1;

        int tne = r * c;
        int cnt = 0;

        while(cnt < tne){
            // left wall
            for(int i = top; i <= bottom && cnt < tne; i++){
                System.out.println(a[i][left]);
                cnt++;
            }
            left++;

            // bottom wall
            for(int i = left; i <= right && cnt < tne; i++){
                System.out.println(a[bottom][i]);
                cnt++;
            }
            bottom--;

            // right wall
            for(int i = bottom; i >= top && cnt < tne; i--){
                System.out.println(a[i][right]);
                cnt++;
            }
            right--;

            // top wall
            for(int i = right; i >= left && cnt < tne; i--){
                System.out.println(a[top][i]);
                cnt++;
            }
            top++;
        }


    }
}
