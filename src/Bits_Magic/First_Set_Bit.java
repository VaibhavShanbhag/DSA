package Bits_Magic;

public class First_Set_Bit {
    public static void main(String[] args) {
        int n = 12;
        int res = 0;

        while(n > 0){
            res++;

            if((n & 1) == 1){
                break;
            }

            n = n >> 1;
        }

        System.out.println(res);
    }
}
