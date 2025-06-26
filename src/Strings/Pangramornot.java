package Strings;

public class Pangramornot {
    public static void main(String[] args) {
        String str = "a Quick Brown Fox jumps over the lazy dog";
        System.out.println("It is a Pangram : "+isPangram(str));
    }
    public static boolean isPangram(String str){
        str = str.toLowerCase();
        for(char ch ='a';ch<='z';ch++){
            if(!str.contains(ch+"")){
                return false;
            }
        }
        return true;
    }
}
