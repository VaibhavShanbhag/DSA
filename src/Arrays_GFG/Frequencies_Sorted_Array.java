package Arrays_GFG;

import java.util.HashMap;
import java.util.Map;

public class Frequencies_Sorted_Array {
    public static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        int[] arr = {10,10,10,25,30,30};
        int n = arr.length;

        frequencySortedArray(arr,n);

        for(int i : map.keySet()){
            System.out.println(i + " " + map.get(i));
        }
    }

    private static void frequencySortedArray(int[] arr, int n) {
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
    }
}
