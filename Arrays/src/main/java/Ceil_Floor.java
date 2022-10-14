public class Ceil_Floor {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int x = 70;
        int low = 0;
        int high = arr.length - 1;
        int ind = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == x){
                ind = mid;
                break;
            }
            else if (arr[mid] > x){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        if (ind != -1)  {
            System.out.println("Ceil: " + arr[ind] + " Floor: " + arr[ind]);
        }
        else{
            System.out.println("Ceil: " + arr[low] + " Floor: " + arr[high]);
        }
    }


}
