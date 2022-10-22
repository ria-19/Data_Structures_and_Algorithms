import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int[][] a = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }



        for(int i = 0; i < m; i++){

            // minimum in row
            int svj = 0;
            for(int j = 1; j < n; j++){
                if (a[i][j] < a[i][svj]){
                    svj = j;
                }
            }

            // maximum in column?
            boolean flag = true;
           for(int k = 0; k < m; k++){
               if (a[k][svj] > a[i][svj]){
                   flag = false;
                   break;
               }
           }

           if (flag == true){
               System.out.println(a[i][svj]);
               return;
           }
        }

        System.out.println("Invalid Input");

    }

}
