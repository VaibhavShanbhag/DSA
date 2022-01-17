package Bits_Magic;

import java.util.ArrayList;

public class Two_Odd_Occuring_Number {
    public static void main(String[] args) {
        /*
        Input: arr[] = {3,4,3,4,8,4,4,32,7,7}
        Output: {32,8}
         */

        int arr[] = {3,4,3,4,8,4,4,32,7,7};
        int n = arr.length;

        //1st Methood Navie Solution. Time Complexity: Theta(n^n)
        ArrayList result = new ArrayList();
        for(int i=0; i<n; i++){
            int count = 0;
            for (int j=0; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count % 2 != 0){
                result.add(arr[i]);
            }
        }
        System.out.println("Odd Numbers are: "+result);

        //2nd Method. Efficient Solution. Time Complexity: Theta(n)

        int XOR = 0, res1 = 0, res2 = 0;

        for (int i=0; i<n; i++){
            XOR ^= arr[i];
        }

        int sb = XOR & (~(XOR-1));

        for(int i=0; i<n; i++){
            if ((arr[i] & sb) != 0){
                res1 ^= arr[i];
            }

            else{
                res2 ^= arr[i];
            }
        }

        int max = Math.max(res1,res2);
        int min = Math.min(res1,res2);

        System.out.println("Odd Number are: "+max + " "+min);

    }
}
