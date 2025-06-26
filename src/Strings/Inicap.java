package Strings;

public class Inicap {
    public static void main(String[] args) {
        String str = "the sun rises in the east";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='a' && ch[i]<='z'){
                if(i==0 || ch[i-1]==' '){
                   ch[i]-=32;     // ch[i] = (char) (ch[i]-32); explaination of this ch[i]-=32;
                }
            }
        }
        System.out.print(ch);
    }
}
