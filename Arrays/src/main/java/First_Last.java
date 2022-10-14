import java.util.Scanner;

public class First_Last {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        int d = in.nextInt();

        int low = 0;
        int high = n - 1;
        int fi = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > d){
                high = mid - 1;
            }
            else if (arr[mid] < d){
                low = mid + 1;
            }
            else{
                fi = mid;
                high = mid - 1;
            }
        }

        System.out.println("First Index: " + fi);


        low = 0;
        high = n - 1;
        int li = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] > d){
                high = mid - 1;
            }
            else if (arr[mid] < d){
                low = mid + 1;
            }
            else{
                li = mid;
                low = mid + 1;
            }
        }

        System.out.println("Last Index: " + li);

    }
}
