package Strings;

public class ChangingCases {
    public static void main(String[] args) {
        String st = "HFFkjLXN";
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='A' && ch[i]<='Z'){    //ASCII value of A=65
                ch[i] = (char)(ch[i]+32);    //when we Add with +32 the upper case Char will change to lower case ==> for example D=68 if we add with +32 the result will be 100==>d
            }
            else if (ch[i]>='a' && ch[i]<='z') {    //ASCII value of a=97
                ch[i]=(char)(ch[i]-32);           //when we subtract with -32 it will change the Char to upper case
            }
        }
        System.out.println(ch);
    }
}
