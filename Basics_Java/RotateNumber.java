import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        // Calculate number of digits
        int temp = n, nod = 0;
        while(temp != 0){
            temp /= 10;
            nod++;
        }

        // Make k suitable for our logic
        k = k % nod;
        if (k < 0){
            k = nod + k;
        }

        // Calculate divisor and multiplier
        int div = 1, multi = 1;
        for (int i = 1; i <= nod ; i++) {
            if (i <= k){
                div = div * 10;
            }
            else{
                multi = multi * 10;
            }
        }

        // Calculate number
        int q = n / div;
        int r = n % div;

        int rotatedNum = r * multi +  q;

        System.out.println(rotatedNum);

    }
}
