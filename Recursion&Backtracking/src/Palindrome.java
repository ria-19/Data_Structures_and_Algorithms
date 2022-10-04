import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        boolean ans = f(0, s);
        if (ans) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean f(int i, String s) {
        int n = s.length();
        if (i >= n / 2) return true;
        return s.charAt(i) == s.charAt(n - 1 - i) && f(i + 1, s);
    }


}
