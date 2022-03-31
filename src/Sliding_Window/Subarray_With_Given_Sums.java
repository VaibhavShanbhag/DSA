package Sliding_Window;

public class Subarray_With_Given_Sums {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int n = arr.length;
        int sum = 33;

        if (subarrayWithGivenSum(arr, n, sum)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static boolean subarrayWithGivenSum(int[] arr, int n, int sum) {
       int i = 0,j = 0;
       int curr_sum = 0;

       while(i <= j && j < n){
           if(curr_sum < sum){
               curr_sum += arr[j];
               j++;
           }

           else if(curr_sum > sum){
               curr_sum -= arr[i];
               i++;
           }

           else{
               return true;
           }
       }

       return false;
    }
}
