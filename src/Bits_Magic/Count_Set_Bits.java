package Bits_Magic;

import java.util.Scanner;

public class Count_Set_Bits {
    int table[] = new int[256];
    public static void main(String[] args) {
        /*
        Input:
              n = 5
        Output:
              Ans = 2
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        /*
        Navie Solution takes of T(n) = theta(total bits in n)
        int res = 0;

        while (n > 0) {
            if (n % 2 != 0) {
                res++;
            }
            n /= 2;
        }

        System.out.println(res);

         */

        /*
        Look up table method for 32bit number..
        Timw Complexity will be theta(1)..
         */

        Count_Set_Bits count_set_bits = new Count_Set_Bits();
        count_set_bits.initializeTable();
        System.out.println("Count of set bits: "+count_set_bits.count(n));

    }

    public void initializeTable() {
        table[0] = 0;

        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];

        }

    }

    public int count(int n){
        int res = table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];
        n = n >> 8;
        res = res + table[n & 0xff];

        return res;
    }

}

