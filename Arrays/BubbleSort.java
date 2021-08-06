package Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {98,67,12,20,10};
        int counter, j;

        for(counter=0; counter< arr.length-1; counter++)
        {
            for(j=0; j< arr.length-1-counter; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("The Sorted array is: ");
        for (int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
