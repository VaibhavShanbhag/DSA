package Bits_Magic;

import java.util.ArrayList;

public class One_Odd_Occuring_Number {
    public static void main(String[] args) {
        /*
        Input: arr[] = {4,3,4,4,4,5,5}
        Output: 3
         */
        int arr[] = {4,3,4,4,4,5,5};
        int res = 0;

        //1st Method. Navie Solution. Time Complexity: Theta(n^2)
//        System.out.println("Odd Number: "+OneOddOccuring(arr));

        //2nd Method. Efficient Solution. Time Conmplexity: Theta(n)
        for(int i=0; i<arr.length; i++){
            res ^= arr[i];
        }

        System.out.println("Odd Number: " +res);

    }

    public static int OneOddOccuring(int[] arr){
        for (int i=0; i< arr.length; i++){
            int count = 0;
            for(int j=0; j< arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }

            if (count % 2 != 0){
               return arr[i];
            }
        }

        return 0;
    }
}
