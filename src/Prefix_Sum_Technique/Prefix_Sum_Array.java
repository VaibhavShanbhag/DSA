package Prefix_Sum_Technique;

public class Prefix_Sum_Array {
    public static void main(String[] args) {
        int[] arr = {2,8,3,9,6,5,4};
        int n = arr.length;

        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for(int i=1; i<n; i++){
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        System.out.println(getSum(prefixSum,0,2));
        System.out.println(getSum(prefixSum,1,3));
    }

    private static int getSum(int[] prefixSum, int l, int r) {
        int ans = 0;

        if(l > 0){
            ans = prefixSum[r] - prefixSum[l-1];
        }

        else{
            ans = prefixSum[r];
        }


        return ans;
    }
}
