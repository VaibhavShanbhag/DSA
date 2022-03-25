package Arrays_GFG;

import java.util.Arrays;

public class Second_Largest_Element {
    public static void main(String[] args) {
        int[] arr = {5,45,52,42,10};
        int n = arr.length;

        int ans = secondLargest(arr,n);
        System.out.println(arr[ans]);
    }

    private static int secondLargest(int[] arr, int n) {
        int res = -1;

        int largest = getLargest(arr,n);

        for(int i=0; i<n; i++){
            if(arr[i] != arr[largest]){
                if (res == -1)
                    res = i;

                else if(arr[i] > arr[res])
                    res = i;
            }
        }

        return res;
    }

    private static int getLargest(int[] arr, int n) {
        int res = -1;
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            if(arr[i] > largest){
                largest = arr[i];
                res = i;
            }
        }

        return res;
    }
}
