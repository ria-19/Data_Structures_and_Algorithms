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
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[] fillOnedFromShell(int[][] a, int s){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;

        int tne = 2 * (maxr - minr  + maxc - minc);
        int[] d1 = new int[tne];

        int ind = 0;
        for(int i = minr; i <= maxr; i++){
           d1[ind] = a[i][minc];
           ind++;
        }
        minc++;

        for(int i = minc; i <= maxc; i++){
            d1[ind] = a[maxr][i];
            ind++;
        }
        maxr--;

        for(int i = maxr; i >= minr; i--){
            d1[ind] = a[i][maxc];
            ind++;
        }
        maxc--;

        for(int i = maxc; i >= minc; i--){
            d1[ind] = a[minr][i];
            ind++;
        }

        return d1;
    }

    public static void fillShellFromOned(int[][] a, int s, int[] d1){
        int minr = s - 1;
        int minc = s - 1;
        int maxr = a.length - s;
        int maxc = a[0].length - s;

        int ind = 0;
        for(int i = minr; i <= maxr; i++){
            a[i][minc] = d1[ind];
            ind++;
        }
        minc++;

        for(int i = minc; i <= maxc; i++){
            a[maxr][i] = d1[ind];
            ind++;
        }
        maxr--;

        for(int i = maxr; i >= minr; i--){
            a[i][maxc] = d1[ind];
            ind++;
        }
        maxc--;

        for(int i = maxc; i >= minc; i--){
            a[minr][i] = d1[ind];
            ind++;
        }

    }
}
