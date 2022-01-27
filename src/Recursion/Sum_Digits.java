package Recursion;

public class Sum_Digits {
    public static void main(String[] args) {
        System.out.println(sum_digits(253 ));
    }

    private static int sum_digits(int n) {
        if(n < 10)
            return n;

        return (n%10) + sum_digits(n/10);
    }
}
