package Strings;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "azazzsdfois##$%^&246464SUDHGDSKJI";
        int low = 0;
        int up = 0;
        int sp = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                low++;
            } else if (ch>='A'&&ch<='Z') {
                up++;
            }else if (ch>='0'&&ch<='9'){
                num++;
            }else {
                sp++;
            }
        }
        System.out.println("Lower : "+low);
        System.out.println("Upper : "+up);
        System.out.println("Numbers : "+num);
        System.out.println("Special : "+sp);
    }
}
