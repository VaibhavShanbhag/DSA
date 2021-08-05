package Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {1,10,20,35,25,90,100,80};
        int data = 100;

        int index_found = linearSearch(arr,data);
        if(index_found == 0)
        {
            System.out.println("Element is not present in an array");
        }

        else
        {
            System.out.println("The element "+data+" is found at index "+index_found);
        }
    }

    public static int linearSearch(int[] arr,int data)
    {
        for(int i=0; i< arr.length; i++)
        {
            if(arr[i] == data)
            {
                return i;
            }
        }

        return 0;
    }

}
