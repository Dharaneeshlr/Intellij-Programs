package Strings;

public class MissingVowel {
    public static void main(String[] args) {
        String str = "Ayvak";  // the output should be AEIOUaeiouyvk
        String st = "AEIOUaeiou";

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if(!str.contains(ch+"")){
                str+=ch;
            }
               //    or
//            if(str.indexOf(ch)==-1){
//                str+=ch;
//            }
        }
        System.out.println(str);
    }
}
