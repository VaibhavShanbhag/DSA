package Mathematics;

public class GcdNos {

    public static int gcd(int a, int b)
    {
        int res = Math.min(a,b);

        while(res > 0)
        {
            if(a % res == 0 && b % res == 0)
            {
                break;
            }

            res--;
        }

        return res;
    }

    public static void main(String[] args) {
        int a,b;
        a = 4;
        b = 6;

        System.out.println(gcd(a,b));
    }
}
