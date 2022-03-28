package Arrays_GFG;

public class Maximum_Subarray_sum {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-1,2};
        int n = arr.length;

        System.out.println(maximumSubarraySum(arr,n));
    }

    private static int maximumSubarraySum(int[] arr, int n) {
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
