package Strings.substring;

public class SmallestSubstringpalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        String smallest = null; //null means:The variable smallest does not point to any string yet.
                                // It’s empty — not " " (an empty string), but truly nothing.
                                //“I haven’t found any palindrome yet.”
        for(int i = 0;i<str.length();i++){
            for(int j=i+3;j<str.length();j++){
                String st = str.substring(i,j);
                if(ispalindrome(st)){
                    if(smallest==null || st.length()<smallest.length()){
                        //If this is the first palindrome found (smallest == null), store it.
                        //If this palindrome is smaller than the current smallest, replace it.
                        smallest=st;
                    }
                }
            }
        }
        System.out.println(smallest);
    }
    public static boolean ispalindrome(String st){
        int i=0;
        int j=st.length()-1;
        while (i<j){
            if(st.charAt(i)!=st.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
