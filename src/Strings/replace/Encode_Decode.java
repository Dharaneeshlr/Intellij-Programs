package Strings.replace;

public class Encode_Decode {
    public static void main(String[] args) {
        System.out.println("Encoded String is : "+encode("abc",2));
        System.out.println("Decoded String is : "+decode("abc",2));
    }
    public static String encode(String str,int n){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                char ch1 =((char) ('A'+(ch-'A'+n)%26));
                res+=ch1;
            } else if (Character.isLowerCase(ch)) {
                char ch1 = ((char)('a'+(ch-'a'+n)%26));
                res+=ch1;
            }else {
                res+=ch;
            }
        }
        return res;
    }
    public static String decode(String str,int n){
        return encode(str,26-(n%26));
    }
}
