package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        if (isPalindrome(str)) {
            System.out.println("The word is palindrome");
        }else {
            System.out.println("The word is not a palindrome");
        }

    }
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
