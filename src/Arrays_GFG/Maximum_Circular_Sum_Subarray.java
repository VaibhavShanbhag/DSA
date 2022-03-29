package Arrays_GFG;

public class Maximum_Circular_Sum_Subarray {
    public static void main(String[] args) {
        int[] arr = {2,3,-4};
        int n = arr.length;

        System.out.println(maximumCircularSumSubarray(arr,n));
    }

    private static int maximumCircularSumSubarray(int[] arr, int n) {
        int max_normal = normalValue(arr,n);

        if(max_normal < 0)
            return max_normal;

        int arr_sum = 0;

        for(int i=0; i<n; i++){
            arr_sum += arr[i];
            arr[i] = - arr[i];
        }

        int maxCircular = arr_sum + normalValue(arr,n);

        return Math.max(maxCircular,max_normal);
    }

    private static int normalValue(int[] arr, int n) {
       int curr = 0, res = arr[0];

        for(int i=0; i<n; i++){
            curr += arr[i];

            res = Math.max(res,curr);

            if(curr < 0)
                curr = 0;
        }

        return res;
    }
}
