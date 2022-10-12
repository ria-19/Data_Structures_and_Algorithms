import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int data = 70;
        int ans = binS(0, arr.length - 1, data, arr);
        System.out.println(ans);
    }

    private static int binS(int low, int high, int x, int[] arr){
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
