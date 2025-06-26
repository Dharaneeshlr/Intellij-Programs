package Strings;

public class MaxOccuredcharacter_count {
    public static void main(String[] args) {
        String str = "Weeelllocooooommme";
        char[] ch = str.toCharArray();
        int maxcount = 0;
        char maxchar = '\u0000';
        for (int i = 0; i < ch.length; i++) {
            int count=1;
            if(ch[i]=='\u0000') continue;
            for(int j =i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            if(count>maxcount){
                maxcount=count;
                maxchar=ch[i];
            }
        }
        System.out.println(maxchar+" = "+maxcount);
    }
}
