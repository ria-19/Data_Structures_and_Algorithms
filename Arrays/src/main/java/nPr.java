import java.util.Scanner;

public class nPr{
    public static int fact(int x){
        int val = 1;
        for(int i = 2; i <= x; i++){
            val *= i;
        }
        return val;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        int nfact = fact(n);
        int nmrfact = fact(n - r);


        // Approach 2
//        int npr = 1;
//        for(int i = n; i > n - r; i--){
//            npr *= i;
//        }

        int npr = nfact / nmrfact;
        System.out.println(n + "P" + r + " = " + npr);

    }
}