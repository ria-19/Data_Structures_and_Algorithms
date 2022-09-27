import java.lang.*;
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        // Question 1
       /* int i = 10;
        for( ;i <= 10; ){
            System.out.println(i);
            i++;
        } */

        // Question 2
       /* int i = 1;
        while(i <= 10);
        {
            System.out.println(i);
            i++;
        } */

        // Question 3
       /* int i = 10;
        if(i++ == i)
            System.out.println(i + " is good");
        else
            System.out.println(i + " is bad");

        // Question 3
        int j = 20;
        if(++j == j)
            System.out.println(j + " is good");
        else
            System.out.println(j + " is bad"); */

        // Question 4
        Scanner scn = new Scanner(System.in);
        /*
        int x = scn.nextInt();
        String name = scn.nextLine();
        System.out.println("x : " + x + " Name: " + name);
        */

        /* String name = scn.nextLine();
        int x = scn.nextInt();
        System.out.println("x : " + x + " Name: " + name); */

        int x = scn.nextInt();
        String y = scn.next();
        System.out.println("x : " + x + " Name: " + y);

    }
}
