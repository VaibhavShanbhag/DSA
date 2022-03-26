package Arrays_GFG;

public class Left_Rotate_Array_By_One {
    public static void main(String[] args) {
        int[] arr = {30,5,20};
        int n = arr.length;

        leftRotateByOne(arr,n);

        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    private static void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0];
        int i = 0;

        for(i=0; i<n-1; i++){
            arr[i] = arr[i+1];
        }

        arr[i] = temp;
    }
}
