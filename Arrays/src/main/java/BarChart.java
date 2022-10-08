import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        int[] arr = insertIntoArray();

        int max =  arr[0];
        for(int i = 1; i < arr.length; i++){
            max = Math.max(arr[i], max);
        }

        for(int i = max; i >= 1; i--){
            for(int j = 0; j < arr.length; j++){
                if (arr[j] >= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
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
