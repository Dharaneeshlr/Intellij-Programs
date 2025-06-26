package Strings;

public class MinOccuredCharacter {
    public static void main(String[] args) {
        String str = "jaaavvvvaaaaaa";
        char[] ch = str.toCharArray();
        int mincount = Integer.MAX_VALUE;
        char minchar = '\u0000';
        for(int i =0;i<ch.length;i++){
            int count =1;
            if(ch[i]=='\u0000') continue;
            for (int j = i+1; j <ch.length; j++) {
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]='\u0000';
                }
            }
            if(count<mincount){
                mincount=count;
                minchar=ch[i];
            }
        }
        System.out.println(minchar+" = "+mincount);
    }
}
