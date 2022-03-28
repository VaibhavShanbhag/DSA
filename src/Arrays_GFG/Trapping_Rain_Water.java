package Arrays_GFG;

public class Trapping_Rain_Water {
    public static void main(String[] args) {
        int[] arr = {5,0,6,1,3};
        int n = arr.length;

        System.out.println(trapRainWater(arr,n));
    }

    private static int trapRainWater(int[] arr, int n) {
        int res = 0;
        int[] rmax = new int[n];
        int[] lmax = new int[n];

        lmax[0] = arr[0];

        for(int i=1; i<n-1; i++){
            lmax[i] = Math.max(lmax[i-1], arr[i]);
        }

        rmax[n-1] = arr[n-1];

        for(int i=n-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1], arr[i]);
        }

        for(int i=1; i<n-1; i++){
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return res;
    }
}
