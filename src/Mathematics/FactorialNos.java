package Mathematics;

public class FactorialNos {

    static int factorialNos(int n)
    {
        if (n == 0)
            return 1;

        return n * factorialNos(n-1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(factorialNos(n));
    }

}
