package Strings.Splitmethod;

public class FindPalindrome {
    public static void main(String[] args) {
        String str = "madam sir madam";
        String[] sp = str.split(" ");
        for(String split : sp){
            if(isPalindrome(split)){
                System.out.print(split);
            }else{
                System.out.print(" _______ ");
            }
        }
    }
    public static boolean isPalindrome(String sp){
        int i=0;
        int j=sp.length()-1;
        while (i<j){
            if(sp.charAt(i)!=sp.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
