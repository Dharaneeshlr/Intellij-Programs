package Strings.replace;

public class Peruntation {
    public static void main(String[] args) {
        String str = "abc";
        isPermutation(str,0,str.length());
    }
    public static void isPermutation(String str,int st,int end){
        if(st==end){
            System.out.print(str+"\t");
            return;
        }
            for (int i = st; i < end; i++) {
                String swapped = isSwap(str,st,i);
                isPermutation(swapped,st+1,end);
            }
    }
    public static String isSwap(String str,int i,int j){
        char[] ch = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
}
