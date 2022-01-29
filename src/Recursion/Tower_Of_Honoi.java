package Recursion;

public class Tower_Of_Honoi {
    public static void main(String[] args) {
        int disks = 2;
        TOH(disks,1,2,3);
        System.out.println("Total Moves: "+(int)(Math.pow(2,disks) - 1));

    }

    public static void TOH(int n, int A, int B, int C){
        if(n == 1){
            System.out.println("Move disk 1 from rod " + A + " to rod " +C);
            return;
        }

        TOH(n-1,A,C,B);
        System.out.println("Move disk " + n + " from rod " + A + " to rod " + C);
        TOH(n-1,B,A,C);
    }
}
