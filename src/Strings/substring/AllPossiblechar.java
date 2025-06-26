package Strings.substring;

public class AllPossiblechar {
    public static void main(String[] args) {
        String str = "malayalam";
        for(int i=0;i<=str.length();i++){
            for(int j=i+3;j<=str.length();j++){
                System.out.println(str.substring(i,j));
            }
        }
    }
}
