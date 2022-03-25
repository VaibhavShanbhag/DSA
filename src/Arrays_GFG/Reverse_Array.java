package Arrays_GFG;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {10,30,1,2};
        int n = arr.length;

        reverseArray(arr,n);
        for (int i: arr){
            System.out.print(i + " ");
        }
    }

    private static void reverseArray(int[] arr, int n) {
        int start = 0;
        int end = n-1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
