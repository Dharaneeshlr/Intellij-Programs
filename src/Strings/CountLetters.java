package Strings;

public class CountLetters {
    public static void main(String[] args) {
        String str = "have a nice day";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            int count = 1;
            if(ch[i]=='\u0000') continue;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            System.out.println(ch[i]+" = "+count);
        }
    }
}
