package Array_2D;

import java.util.ArrayList;
import java.util.Scanner;

public class SpiralPrint2D {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        takeInput(matrix);
        System.out.println("<----Normal Print---->");
        displayNormal(matrix);
        ArrayList<Integer> spiralMatrix = spiralPrint(matrix);
        System.out.println("<----Spiral Print---->");
        displaySpiral(spiralMatrix);
    }

    private static void takeInput(int[][] mat)
    {
        for (int row=0; row< mat.length; row++)
        {
            for (int col=0; col<mat[row].length; col++)
            {
                System.out.print("Enter the elements of row "+ row +" and col "+col+": ");
                mat[row][col] = sc.nextInt();
            }
        }
    }

    private static void displayNormal(int[][] mat)
    {
        for (int row=0; row< mat.length; row++)
        {
            for (int col=0; col<mat[row].length; col++)
            {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static ArrayList<Integer> spiralPrint(int[][] mat) {
        ArrayList<Integer> spiralMat = new ArrayList<>();
        int  top, bottom, left, right, dir, count, i;

        top = 0;
        bottom = mat.length-1;
        left = 0;
        right = mat[top].length-1;
        dir = 1;
        count = (bottom+1) * (right+1);

        while(left <= right && top <= bottom)
        {
            if(count > 0)
            {
                if(dir == 1)
                {
                    for(i=left; i<=right; i++)
                    {
                        spiralMat.add(mat[top][i]);
                        count--;
                    }
                    dir = 2;
                    top++;
                }

                else if(dir == 2)
                {
                    for(i=top; i<=bottom; i++)
                    {
                        spiralMat.add(mat[i][right]);
                        count--;
                    }
                    dir = 3;
                    right--;
                }

                else if(dir == 3)
                {
                    for(i=right; i>=left; i--)
                    {
                        spiralMat.add(mat[bottom][i]);
                        count--;
                    }
                    dir = 4;
                    bottom--;
                }

                else if(dir == 4)
                {
                    for(i=bottom; i>=top; i--)
                    {
                        spiralMat.add(mat[i][left]);
                        count--;
                    }
                    dir = 1;
                    left++;
                }
            }
        }
        return spiralMat;
    }

    private static void displaySpiral(ArrayList<Integer> spiralMatrix) {

        for(int i: spiralMatrix){
            System.out.print(i + " ");
        }
    }
}
