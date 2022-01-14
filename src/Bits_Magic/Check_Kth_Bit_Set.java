package Bits_Magic;

import java.util.Scanner;

public class Check_Kth_Bit_Set {
    public static void main(String[] args) {
        /*
        Input:
              n = 5  and  k = 1
        Output:
              Yes
         */

        //Using Left Shift

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value for k: ");
        int k = scanner.nextInt();

        kth_set_bit(n,k);
    }

    public static void kth_set_bit(int n, int k){
        if ((n & (1 << (k - 1))) != 0){
            System.out.println("Yes");
        }

        else{
            System.out.println("No");
        }
    }
}
