package Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {100,85,70,65,30,10};
        int counter;
        int j;

        for (counter=1; counter< arr.length; counter++)
        {
            int val = arr[counter];
            j = counter - 1;
            while (j>=0 && arr[j] > val)
            {
                arr[j+1] = arr[j];
                j--;
            }
                arr[j+1] = val;
        }

        System.out.print("The Sorted array is: ");
        for (int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
