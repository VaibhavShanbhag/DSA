package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    private static int factorial(int n){
        if(n <= 1)
            return n;

        return n * factorial(n-1);
    }
}
