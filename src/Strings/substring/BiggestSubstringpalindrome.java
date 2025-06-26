package Strings.substring;

public class BiggestSubstringpalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        String st1 = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j=i+3;j<str.length();j++){
                String st = str.substring(i,j);
              //  System.out.println(st); //if any clarification needed add this...
                if(ispalindrome(st) && st.length()>st1.length()){
                    st1=st;
                }
            }
        }
        System.out.println("--------------------------");
        System.out.println(st1);
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
