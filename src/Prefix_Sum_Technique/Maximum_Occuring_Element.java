package Prefix_Sum_Technique;

public class Maximum_Occuring_Element {
    public static void main(String[] args) {
        int[] left_range = {1,2,3};
        int[] right_range = {3,5,7};
        int n = left_range.length;

        System.out.println(maximumOccuringElementInRange(left_range,right_range,n));
    }

    private static int maximumOccuringElementInRange(int[] left_range, int[] right_range, int n) {
        int[] arr = new int[1000];

        for(int i=0; i<n; i++){
            arr[left_range[i]]++;
            arr[right_range[i] + 1]--;
        }

        int max = arr[0];

        for(int i=1; i<1000; i++){
            arr[i] += arr[i-1];

            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;

    }
}
