package Strings;

public class Bos$s$ {
    public static void main(String[] args) {
        String str = "Bossss";
        char[] ch = str.toCharArray();
        for(int i = 0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
                ch[i+1]='$';
            }
        }
        System.out.println(ch);
    }
}
