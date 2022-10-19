import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }

        // Transpose -- reverse for upper triangle
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                    int tmp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = tmp;
            }
        }

        // Reverse every row
        for(int[] arr: a){
            reverse(arr);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + "\t");;
            }
            System.out.println();
        }
    }

    static void reverse(int[] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }
}
