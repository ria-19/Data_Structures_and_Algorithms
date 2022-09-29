import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
        String ans = "below par";
        // Write your code here
        if(marks > 90){
            ans = "excellent";
        }
        else if (marks > 80){
            ans = "good";
        }
        else if (marks > 70){
            ans = "fair";
        }
        else if (marks > 60){
            ans = "meets expectations";
        }
        System.out.println(ans);
    }
}
