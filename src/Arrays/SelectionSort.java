package Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {100,85,70,65,30,10};
        int counter;

        for(counter=0; counter< arr.length-1; counter++)
        {
            int min = counter;

            for(int j=counter+1; j< arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }

        System.out.print("The Sorted array is: ");
        for (int i: arr)
        {
            System.out.print(i + " ");
        }
    }
}
