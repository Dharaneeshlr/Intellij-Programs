package Strings;

public class ArrangeCharAscendingOrder {
    public static void main(String[] args) {
        String str = "sdfagh";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]>ch[j]){
                    char temp = ch[i];
                    ch[i]=ch[j];
                    ch[j]=temp;
                }
            }
            System.out.print(ch[i]);
        }
    }
}
