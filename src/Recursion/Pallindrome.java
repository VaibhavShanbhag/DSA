package Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        String str = "abbcbba";
        int start = 0;
        int end = str.length()-1;
        if(is_pallindrome(str,start,end))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean is_pallindrome(String str, int start, int end) {

        if(start >= end)
            return true;

        return (str.charAt(start) == str.charAt(end)) && is_pallindrome(str,start+1,end-1);
    }
}
