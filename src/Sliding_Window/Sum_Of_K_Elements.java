package Sliding_Window;

public class Sum_Of_K_Elements {
    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};
        int n = arr.length;
        int k = 3;

        System.out.println(maximumSumOfKElements(arr,n,k));
    }

    private static int maximumSumOfKElements(int[] arr, int n, int k) {
        int maxSum = 0;
        int currSum = 0;

        for(int i=0; i<k; i++){
            currSum += arr[i];
        }

        maxSum = currSum;

        for(int i=k; i<n; i++){
            currSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,currSum);
        }

        return maxSum;
    }
}
