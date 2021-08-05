package Arrays;

public class Arrays_Upper_Bound_BS {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6,6,8};
        int data = 6;
        int ans = -1;      //if element is found at upper bound index

        int low = 0;
        int high = arr.length-1;

        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == data){
                ans = mid;
                low = mid + 1;
            }

            else if(data < arr[mid]){
                high = mid - 1;
            }

            else{
                low  = mid + 1;
            }
        }

        System.out.println("Upper bound of " +data+" is: "+ans);
    }
}
