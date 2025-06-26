package Strings.replace;

public class MaxOccurenceOftheCharacter {
    public static void main(String[] args) {
        String str = "mangoesorsweetgostofheat";
        String st = "";
        int maxcount = 0;
        char maxchar = ' ';
        while(str.length()!=0){
            char ch = str.charAt(0);
            st = str.replace(ch+"","");
            int count = str.length()-st.length();
            if(count>maxcount){
                maxcount = count;
                maxchar = ch;
            }
            str=st;
        }
        System.out.println(maxchar + " = "+maxcount);
    }
}
