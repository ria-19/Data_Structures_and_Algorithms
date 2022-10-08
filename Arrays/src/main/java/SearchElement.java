import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = insertIntoArray();
        int n = in.nextInt();
        int ans = search(arr, n);

        System.out.println("Element found at: " + ans);

    }

    public static int[] insertIntoArray(){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        return arr;
    }

    public static int search(int[] arr, int n){
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
