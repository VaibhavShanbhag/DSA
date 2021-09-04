package Mathematics;

public class CountDigits {

    static int countDigits(int n)
    {
//        int count = 0;
//
//        while(n != 0)
//        {
//            n /= 10;
//            count++;
//        }

        int count = (int) (Math.floor(Math.log10(n)) + 1);

        return count;
    }

    public static void main(String[] args) {

        int  n = 1000;

        System.out.println("The number of digits of a number is "+ countDigits(n));

    }
}
