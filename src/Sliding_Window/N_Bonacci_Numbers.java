package Sliding_Window;

public class N_Bonacci_Numbers {
    public static void main(String[] args) {
        int n = 3;
        int m = 8;
        int[] arr = new int[m];

        for(int i=0; i<m; i++){
            arr[i] = 0;
        }
        arr[n-1] = 1;
        arr[n] = 1;

        nbiconacci(arr,n,m);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    private static void nbiconacci(int[] arr, int n, int m) {
        for(int i=n+1; i<m; i++){
            arr[i] = 2*arr[i-1] - arr[i-n-1];
        }
    }
}
