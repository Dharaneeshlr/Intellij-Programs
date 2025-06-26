package Strings;

public class RemoveDuplicateCharaters_containindexof {
    public static void main(String[] args) {
        String str = "aaabbbcccdddd";
        String st = "";
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(st.indexOf(ch)==-1){
                st+=ch;
            }
                    //  or
//            if(!st.contains(ch+"")){
//                st+=ch;
//            }
        }
        System.out.println(st);
     }
}
