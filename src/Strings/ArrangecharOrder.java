package Strings;

public class ArrangecharOrder {
    public static void main(String[] args) {
        String st = "jkfhasufjNOUsfhuashfiSHD123BFUSY456789@#544465446487564$%^&*()";
        String up = "";
        String low = "";
        String num = "";
        String sp = "";

        for (int i = 0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch>='A' && ch<='Z') up+=ch;
            else if (ch>='a' && ch<='z') low+=ch;
            else if (ch>='0' && ch<='9') num+=ch;
            else sp+=ch;
        }
       String s = up+low+num+sp;
        System.out.println(s);

    }
}
