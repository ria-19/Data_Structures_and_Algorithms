import java.util.Scanner;

public class ExitPoint {
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
        int dir = 0;
        int i = 0;
        int j = 0;

        while(true){
            dir = (dir + a[i][j]) % 4;

            if (dir == 0){
                j++;
            }
            else if (dir == 1){
                i++;
            }
            else if (dir == 2){
                j--;
            }
            else{
                i--;
            }

            if (i < 0){
                i++;
                break;
            }
            else if (i == r){
                i--;
                break;
            }
            else if (j == c){
                j--;
                break;
            }
            else if (j < 0){
               j++;
               break;
            }
        }

        System.out.println("Exit Point: " + "(" + i + ", " + j + ")");
    }
}
