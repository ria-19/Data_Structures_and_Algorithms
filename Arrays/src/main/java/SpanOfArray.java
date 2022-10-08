import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        int[] arr = insertIntoArray();
        System.out.println("Span of Array: " + spanOfArray(arr));
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

    public static int spanOfArray(int[] arr){
        int min = arr[0], max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }

            if (arr[i] < min){
                min = arr[i];
            }
        }

        return max - min;
    }
}
