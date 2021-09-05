package Mathematics;
import java.util.ArrayList;
import java.util.Arrays;

public class SieveErathosthenes {

    public static ArrayList sieve(boolean[] primeNos, int n)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=2; i<=n; i++)
        {
            if(primeNos[i])
            {
                result.add(i);
                for (int j = i*i; j <=n ; j=j+i) {
                    primeNos[j] = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 10;
        boolean[] primeNos = new boolean[n+1];
        Arrays.fill(primeNos,true);

        System.out.println(sieve(primeNos,n));
    }
}
