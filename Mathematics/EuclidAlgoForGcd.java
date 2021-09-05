package Mathematics;

public class EuclidAlgoForGcd {
    public static int euclidAlgo(int a, int b) {
        if(b == 0)
            return a;

        else
        return euclidAlgo(b,a%b);
    }

    public static void main(String[] args) {
        int a, b;
        a = 4;
        b = 6;

        System.out.println(euclidAlgo(a, b));
    }

}
