package Strings.replace;

public class OccuranceOfEachcharacter {
    public static void main(String[] args) {
        String str = "jaaavaaajj";
        String st = "";
        while(str.length()!=0){
            char ch = str.charAt(0);
            st = str.replace(ch+"","");
            int count = str.length()-st.length();
            System.out.println(ch+" = "+count);
            str=st;
        }
    }
}
