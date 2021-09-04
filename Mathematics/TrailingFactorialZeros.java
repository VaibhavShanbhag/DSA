package Mathematics;

public class TrailingFactorialZeros {
    static int trailingZeros(int n)
    {
       int count = 0;

        for (int i = 5; i <=n ; i = i*5) {
            count += n/i;
        }

        return count;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(trailingZeros(n));
    }
}
