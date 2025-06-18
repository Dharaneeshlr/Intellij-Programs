package Strings;

public class StringtoInteger {
    public static void main(String[] args) {
        String st = "MFDKLSJ@$363467678";
        int num = 0;
        for(int i=0;i<st.length();i++){
            char ch = st.charAt(i);
            if(ch>='0' && ch<='9'){
                num = (num*10) + (ch-'0');
            }
        }
        System.out.println(num);
    }
}
