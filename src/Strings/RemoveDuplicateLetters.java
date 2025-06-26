package Strings;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String str = "aabbccddeeff  jjrrsss";
        char[] ch = str.toCharArray();
        String temp ="";
        for (int i = 0; i < ch.length; i++) {
            if(ch[i]=='\u0000') continue;
            for (int j = i+1; j < ch.length; j++) {
                if(ch[i]==ch[j]){
                    ch[j]='\u0000';
                }
            }
            temp+=ch[i];
        }
        System.out.print(temp);
    }
}
