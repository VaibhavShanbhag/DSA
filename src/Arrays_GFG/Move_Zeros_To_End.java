package Arrays_GFG;

public class Move_Zeros_To_End {
    public static void main(String[] args) {
        int[] arr = {0,0,1};
        int n = arr.length;
        moveZerosAtEnd(arr,n);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    private static void moveZerosAtEnd(int[] arr, int n) {
        int count = 0;
        for (int i=0; i<n; i++){
        if (arr[i] != 0){
            swap(arr,i,count);
            count++;
        }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
