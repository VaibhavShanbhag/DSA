package Recursion;

public class Rope_Cutting_Problem {
    public static void main(String[] args) {
        int n = 9;
        int a = 7;
        int b = 7;
        int c = 7;

        System.out.println(max_pieces(n,a,b,c));
    }

    private static int max_pieces(int n, int a, int b, int c) {
        if(n == 0)
            return 0;

        if(n < 0)
            return -1;

        int res1 = Math.max(max_pieces(n-a,a,b,c),max_pieces(n-b,a,b,c));
        int res = Math.max(res1,max_pieces(n-c,a,b,c));

        if(res == -1)
            return -1;

        return res + 1;

    }
}
