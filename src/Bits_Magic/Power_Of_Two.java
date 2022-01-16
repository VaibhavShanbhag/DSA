package Bits_Magic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Power_Of_Two {
    public static void main(String[] args) {
        /*
        Input = 4
        Output = Yes
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int res = 0;

        /*
        1st Solution where time complexity wil be theta(n)
         */
        if ((n & (n-1)) == 0){
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }

        /*
        2nd Solution where time complexity wil be theta(count of set bits)
         */
        while(n > 0){
           n = (n & (n-1));
           res++;
        }

        if (res == 1){
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }


    }
}
