package Prefix_Sum_Technique;

public class Equilibrium_Point {
    public static void main(String[] args) {
        int[] arr = {3,4,8,-9,20,6};
        int n = arr.length;

        if(equlibriliumPoint(arr,n))
            System.out.println("Yes");

        else
            System.out.println("No");

    }

    private static boolean equlibriliumPoint(int[] arr, int n) {
        int sum = 0;

        for(int i=0; i<n; i++)
            sum += arr[i];

        int lmax = 0;

        for(int i=0; i<n; i++){
            if(lmax == sum-arr[i])
                return true;

            else{
                lmax += arr[i];
                sum -= arr[i];
            }
        }

        return false;
    }
}
