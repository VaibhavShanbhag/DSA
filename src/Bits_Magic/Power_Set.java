package Bits_Magic;

import java.util.ArrayList;

public class Power_Set {
    public static void main(String[] args) {
        /*
        Input: s = "abc"
        Output: "","a","b","c","ab","ac","bc","abc"
         */

        //Time Complexity of this solution is: Theta(2^n*n)
        String s = "ab";
        System.out.println(printPowerSubset(s));


    }

    public static ArrayList<ArrayList<Character>> printPowerSubset(String s){
        ArrayList<ArrayList<Character>> finalresult = new ArrayList<>();
        int n = s.length();
        int power_size = 1 << n;
        for (int i=0; i<power_size; i++){
            ArrayList<Character> result = new ArrayList<>();
            for (int j=0; j<n; j++){
                if((i & (1 << j)) != 0){
                    result.add(s.charAt(j));
                }
            }
            finalresult.add(result);
        }

        return finalresult;
    }
}
