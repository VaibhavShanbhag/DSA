package Arrays_GFG;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_In_Array {
    public static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {7,10,4,10,6,5,2};
        int n = arr.length;

        leaderArray(arr,n);

        Collections.reverse(result);

        for (int i: result){
            System.out.print(i + " ");
        }
    }

    private static void leaderArray(int[] arr, int n) {
        int curr = arr[n-1];
        result.add(curr);

        for(int i=n-2; i>=0; i--){
            if(curr < arr[i]){
                curr = arr[i];
                result.add(curr);
            }
        }
    }
}
