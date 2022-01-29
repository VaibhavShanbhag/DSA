package Recursion;

public class Josephus_Problem {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;

        System.out.println(jospheus(n,k) + 1);
    }

    private static int jospheus(int n, int k) {

        if(n == 1)
            return 0;

        return (jospheus(n-1,k) + k) % n;
    }

}
