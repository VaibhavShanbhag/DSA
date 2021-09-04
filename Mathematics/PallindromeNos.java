package Mathematics;

public class PallindromeNos {

    static boolean pallindromeNos(int n)
    {
        int orgNo = n;
        int r, revSum = 0;

        while(n != 0)
        {
            r = n % 10;
            revSum = revSum * 10 + r;
            n /= 10;
        }

        if (revSum == orgNo){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 12;

        System.out.println(pallindromeNos(n));
    }
}
