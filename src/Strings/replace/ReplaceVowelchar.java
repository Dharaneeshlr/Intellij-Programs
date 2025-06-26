package Strings.replace;

public class ReplaceVowelchar {
    public static void main(String[] args) {
        String str = "jspiders";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                str = str.replace(ch+"","");
            }
        }
        System.out.println(str);
    }
}
