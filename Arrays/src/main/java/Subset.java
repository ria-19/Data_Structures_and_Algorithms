import java.util.Scanner;

public class Subset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }


        // Subsets === 2^n
        int limit = (int) Math.pow(2, n);
        for(int i = 0; i < limit; i++){
            String set = "";
            int tmp = i;
            for(int j = n - 1; j >= 0; j--){
                int r = tmp % 2;
                tmp  = tmp / 2;

                if (r == 0){
                    set = "-" + "\t" + set;
                }
                else{
                    set = arr[j] +  "\t"  + set;
                }
            }
            System.out.println(set);
        }

    }
}
