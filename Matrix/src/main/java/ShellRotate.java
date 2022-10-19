import java.util.Scanner;

public class ShellRotate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = in.nextInt();
            }
        }

        int s = in.nextInt();
        int r = in.nextInt();

        rotateShell(a, s, r);
        display(a);
    }

    public static void rotateShell(int[][] a, int s, int r){
        int[] d1 = fillOnedFromShell(a, s);
        rotate(d1, r);
        fillShellFromOned(a, s, d1);
    }

    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        if (k < 0){
            k = k + n;
        }

        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int l, int r){
        while(l < r){
            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;
            r--;
        }
    }

    public static void display(int[][] a) {
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static int[] fillOnedFromShell(int[][] a, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - 1;
        int maxc = a[0].length - 1;

        int tne = (min)
    }

    public static void fillShellFromOned(int[][] a, int s, int[] d1){

    }
}
