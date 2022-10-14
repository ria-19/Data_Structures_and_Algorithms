import java.util.Arrays;

public class Oct_12 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 1, 2};
        int ans = largestPerimeter(nums);
        System.out.println(ans);
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 2; i > 0; i--){
            if (nums[i + 1] < nums[i - 1] + nums[i])
                return nums[i] + nums[i - 1] + nums[i + 1];
        }
        return 0;
    }
}
