package Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {1,15,25,30,40,58,68,70};
        int data = 1;

        int index_found = binarySearch(arr,data);
        if(index_found == -1)
        {
            System.out.println("Element is not present in an array");
        }

        else
        {
            System.out.println("The element "+data+" is found at index "+index_found);
        }
    }

    public static int binarySearch(int[] arr, int data)
    {
        int low = 0;
        int high = arr.length-1;

        while (low <= high)
        {
            int mid = (low+high)/2;
            if (arr[mid] > data)
            {
                high = mid - 1;
            }

            else if(arr[mid] < data)
            {
                low = mid + 1;
            }

            else
            {
                return mid;
            }
        }

        return -1;
    }
}
