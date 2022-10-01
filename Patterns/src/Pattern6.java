import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sp = 1;
        int st = (n / 2) + 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }

            if (i <= (n / 2)){
                st--;
                sp += 2;
            }
            else{
                st++;
                sp -= 2;
            }

            System.out.println();
        }
    }
}
