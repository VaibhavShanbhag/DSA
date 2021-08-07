package Array_2D;

import java.util.ArrayList;
import java.util.Scanner;

public class WavePrint2D {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        takeInput(matrix);
        System.out.println("<----Normal Print---->");
        displayNormal(matrix);
        ArrayList<Integer> waveMatrix = wavePrint(matrix);
        System.out.println("<----Wave Print---->");
        displayWave(waveMatrix);
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

    private static ArrayList<Integer> wavePrint(int[][] mat) {
        ArrayList<Integer> waveMat = new ArrayList<>();

        int row = mat.length;
        int col = mat[0].length;

        for (int r = 0; r < row; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < col; c++) {
                    waveMat.add(mat[r][c]);
                }
            } else {
                for (int c = col - 1; c >= 0; c--) {
                    waveMat.add(mat[r][c]);
                }
            }
        }
        return waveMat;
    }

    private static void displayWave(ArrayList<Integer> waveMatrix) {

        for(int i: waveMatrix){
            System.out.print(i + " ");
        }
    }
}
