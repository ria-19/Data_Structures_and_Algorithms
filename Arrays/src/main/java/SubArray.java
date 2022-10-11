import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = insertIntoArray();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                for(int k = i; k <= j; k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }
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

}
