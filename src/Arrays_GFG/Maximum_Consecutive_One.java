package Arrays_GFG;

public class Maximum_Consecutive_One {
    public static void main(String[] args) {
        int[] arr = {0,1,1,0,1,1,1};
        int n = arr.length;

        System.out.println(maxConsecutiveOne(arr,n));
    }

    private static int maxConsecutiveOne(int[] arr, int n) {
        int res = 0, curr = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                curr = 0;

            else{
                curr++;
                res = Math.max(res,curr);
            }
        }

        return res;
    }
}
