import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        // Naive Method
        //
        /*
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int count = 0;
            for(int div = 1; div <= n; div++){
                if (n % div == 0){
                    count++;
                }
            }

            if (count == 2){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        } */

        // 1st Optimization
       /* for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if (n % div == 0){
                    count++;
                }
            }

            if (count == 0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        } */

        // 2nd Optimization

        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int count = 0;
            for(int div = 2; div * div <= n; div++){
                if (n % div == 0){
                    count++;
                    break;
                }
            }

            if (count == 0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }

    }
}
