package Arrays_GFG;

public class Left_Rotate_Array_By_D_Places {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 3;
        int n = arr.length;

        leftRotateByDPlaces(arr,n,d);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    private static void leftRotateByDPlaces(int[] arr, int n, int d) {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
