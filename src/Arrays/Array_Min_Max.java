package Arrays;

import java.util.Scanner;

public class Array_Min_Max<sc> {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter Size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        takeInput(arr);
        FindingMaxMin(arr);
    }

    public static void takeInput(int[] arr)
    {
        System.out.println("Enter the array inputs: ");
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        display(arr);
    }

    public static  void display(int[] arr)
    {
        System.out.println("Array Elements are: ");
        for (int i: arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void FindingMaxMin(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }

            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

    }

}
