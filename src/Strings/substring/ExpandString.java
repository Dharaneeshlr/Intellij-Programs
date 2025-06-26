package Strings.substring;

public class ExpandString {
    public static void main(String[] args) {
        String str = "a2b2c2d2f3";
        String result = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            i++;   //move to the number character
            int count = Character.getNumericValue(str.charAt(i));

            //Character.getNumericValue() converts '2' → 2.

            for(int j=0;j<count;j++){
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
