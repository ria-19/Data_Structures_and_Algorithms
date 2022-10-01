import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // Approach 1
//        int sp = n - 1;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= sp; j++){
//                System.out.print("\t");
//            }
//
//            System.out.print("*");
//            sp--;
//            System.out.println();
//        }

        // Approach 2
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (i + j == (n + 1)){
                    System.out.print("*");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
