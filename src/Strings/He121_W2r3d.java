package Strings;

//repeating character is changed into numbers

public class He121_W2r3d {
    public static void main(String[] args) {
        String str = "Hello World";
        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length;i++){
            char count = '1';
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=count;
                }
            }
            if (count != '1') {
                ch[i]='1';
            }
        }
        System.out.println(ch);
    }
}
