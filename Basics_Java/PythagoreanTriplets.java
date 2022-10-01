import java.util.Scanner;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b >= max){
            max = b;
        }

        if (c >= max){
            max = c;
        }

        boolean flag = false;
        if (max == a){
            flag = ((a * a) == ((b * b) + (c * c)));
        }
        else if (max == b){
            flag = ((b * b) == ((a * a) + (c * c)));
        }
        else{
            flag = ((c * c) == ((b * b) + (a * a)));
        }

        System.out.println(flag);
    }
}
