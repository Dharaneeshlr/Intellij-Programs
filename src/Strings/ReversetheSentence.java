package Strings;

public class ReversetheSentence {
    public static void main(String[] args) {
        String str = "java is easy";
            System.out.println(isSentence(str));
    }
    public static String isSentence(String str){
        int i = str.length()-1;
        int j = str.length()-1;
        String s2="";
        while(j>0){
            while(j>=0 && str.charAt(j)!=' '){
                j--;
            }
            int k = j+1;
            String temp="";
            while(k<=i){
                temp+=str.charAt(k);
                k++;
            }
            s2+=temp;
            if(j>0)s2+=" ";
           j--;
           i=j;
        }
        return s2;
    }
}
