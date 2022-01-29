package Recursion;

public class Subsets_Sum_Problem {
    public static void main(String[] args) {
        int[] arr = {10,20,15};
        int sum = 25;
        int n = arr.length;

        System.out.println(Subsets_Sum(arr, sum, n));
    }

    private static int Subsets_Sum(int[] arr, int sum, int n) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }

        return Subsets_Sum(arr, sum, n - 1) + Subsets_Sum(arr, sum - arr[n - 1], n - 1);

    }
}
