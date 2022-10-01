import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int sp = n / 2;
        int st = 1;
        int row = 1;
        for(int i = 1; i<= n; i++){
            int value = row;
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }

            for(int j = 1; j <= st; j++){
                System.out.print(value + "\t");
                if (j <= (st / 2)){
                    value++;
                }
                else{
                    value--;
                }
            }

            if (i <= (n / 2)){
                sp--;
                st += 2;
                row++;
            }
            else{
                sp++;
                st -= 2;
                row--;
            }
            System.out.println();
        }
    }
}
