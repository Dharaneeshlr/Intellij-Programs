package Strings.replace;

public class MinOccurenceOftheCharacter {
    public static void main(String[] args) {
        String str = "javaaajjaavajjaa";
        String st = "";
        int mincount = Integer.MAX_VALUE;
        char minchar = ' ';
        while(str.length()!=0){
            char ch = str.charAt(0);
            st = str.replace(ch+"","");
            int count = str.length()-st.length();
            System.out.println(ch+ " = "+count);
            if(count<mincount){
                mincount = count;
                minchar = ch;
            }
            str=st;
        }
        System.out.println("------------------------------");
        System.out.println(minchar +" = "+mincount);
    }
}
