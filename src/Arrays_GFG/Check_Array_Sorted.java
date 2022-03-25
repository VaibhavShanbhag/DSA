package Arrays_GFG;

public class Check_Array_Sorted {
    public static void main(String[] args) {
        int[] arr = {7,20,30,10};
        int n = arr.length;

        if (checkSortedArray(arr,n)){
            System.out.println("Arrays is sorted");
        }

        else{
            System.out.println("Array is not sorted");
        }
    }

    private static boolean checkSortedArray(int[] arr, int n) {
        boolean res = true;

        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                res = false;
                return res;
            }

            else
                continue;
        }

        return res;
    }
}
