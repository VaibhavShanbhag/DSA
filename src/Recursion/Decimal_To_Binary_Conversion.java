package Recursion;

public class Decimal_To_Binary_Conversion {
    public static void main(String[] args) {
        fun(8);
    }

    private static void fun(int n) {
        if (n == 0)
            return ;

        fun(n/2);
        System.out.print(n%2);
    }
}
