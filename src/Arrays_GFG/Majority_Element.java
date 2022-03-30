package Arrays_GFG;

public class Majority_Element {
    public static void main(String[] args) {
        int[] arr = {8,7,6,8,6,6,6,6};
        int n = arr.length;

        System.out.println(majorityElement(arr,n));
    }

    private static int majorityElement(int[] arr, int n) {
        int res = 0, count = 1;

        for(int i=1; i<n; i++){
            if(arr[res] == arr[i])
                count++;

            else if(count == 0){
                res = i;
                count = 1;
            }

            else
                count--;

        }

        count = 0;
        for(int i=0; i<n; i++){
            if(arr[res] == arr[i])
                count++;
        }

        if (count <= n/2)
            return -1;

        return res;
    }
}
