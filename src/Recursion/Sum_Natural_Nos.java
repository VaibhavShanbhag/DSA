package Recursion;

public class Sum_Natural_Nos {
    public static void main(String[] args) {
        System.out.println(sum_natural_nos(5));
    }

    private static int sum_natural_nos(int n) {
        if(n == 0)
            return n;

        return n + sum_natural_nos(n-1);
    }
}
