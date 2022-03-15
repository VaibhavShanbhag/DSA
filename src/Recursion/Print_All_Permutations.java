package Recursion;

public class Print_All_Permutations {
    public static void main(String[] args) {
        String str = "123";
        System.out.println("Permutation of " + str + " is: ");
        permutation(str,0);
    }

    private static void permutation(String str, int index) {
        if(index >= str.length()){
            System.out.println(str);
            return;
        }

        for(int i=index; i<str.length(); i++){
            str = swap(str,index,i);
            permutation(str,index+1);
            str = swap(str,i,index);
        }
    }

    private static String swap(String str, int a, int b) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[a];
        charArray[a] = charArray[b];
        charArray[b] = temp;

        return String.valueOf(charArray);
    }
}
