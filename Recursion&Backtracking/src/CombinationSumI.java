//  General Approach --  not assuming every element to be positive integer
// https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CombinationSumI {
    public static void f(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if (ind == arr.length){
            if (target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (target >= arr[ind]){
            ds.add(Integer.valueOf(arr[ind]));
            f(ind, arr, target - arr[ind], ans, ds);
            ds.remove(Integer.valueOf(arr[ind])); // or ds.remove(ds.size() - 1) -- using index
        }
        f(ind + 1, arr, target, ans, ds);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = insertIntoArray();
        int target = in.nextInt();

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();

        f(0, arr, target, ans, ds);

        for (List<Integer> l: ans) {
            System.out.println(l.toString());
        }
    }

    // Input array
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
