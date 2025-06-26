package Strings.Splitmethod;

public class ReveseLetters {
    public static void main(String[] args) {
        String s = "java is easy";
        String[] sp =s.split(" ");
        for(int i=sp.length-1;i>=0;i--){
            System.out.print(rev(sp[i]+" "));
        }
    }
    public static String rev(String sp){
        String res = "";
        for(int i = sp.length()-1;i>=0;i--){
            res+=sp.charAt(i);
        }
        return res;
    }
}
