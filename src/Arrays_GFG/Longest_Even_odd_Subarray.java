package Arrays_GFG;

public class Longest_Even_odd_Subarray {
    public static void main(String[] args) {
        int[] arr = {10,12,14,7,8};
        int n = arr.length;

        System.out.println(longestEvenOddSubarray(arr,n));
    }

    private static int longestEvenOddSubarray(int[] arr, int n) {
        int res = 1;
        int curr = 1;

        for(int i=1; i<n; i++){
            if((arr[i] % 2 == 0 && arr[i-1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i-1] % 2 == 0)){
                curr++;
                res = Math.max(curr,res);
            }

            else
                curr = 1;
        }

        return res;
    }
}
