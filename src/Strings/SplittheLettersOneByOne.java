package Strings;

public class SplittheLettersOneByOne {
    public static void main(String[] args) {
        String str = "Ram";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j)+"");
            }
            System.out.println();
        }
    }
}
