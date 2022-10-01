import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt(), n2 = in.nextInt();
        int temp1 = n1;
        int temp2 = n2;
        while (temp1 % temp2 != 0) {
            int rem = temp1 % temp2;
            temp1 = temp2;
            temp2 = rem;
        }
        int gcd = temp2;
        int lcm = (n1 * n2) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
