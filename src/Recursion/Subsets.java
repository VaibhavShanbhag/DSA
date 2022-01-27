package Recursion;

import java.util.ArrayList;
import java.util.Collections;

public class Subsets {
    static ArrayList<String>  res = new ArrayList<>();
    public static void main(String[] args) {
        String input = "ABC";
        ArrayList<String> res = new ArrayList();
        subsets(input, "", 0, res);
        Collections.sort(res);
        System.out.println(res);
    }

    private static void subsets(String input, String output, int index, ArrayList<String> res) {
        if(index == input.length()){
            res.add(output);
            return;
        }

        subsets(input,output,index+1, res);
        subsets(input,output+input.charAt(index),index+1, res);

    }
}
