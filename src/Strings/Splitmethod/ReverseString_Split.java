package Strings.Splitmethod;

public class ReverseString_Split {
    public static void main(String[] args) {
        String s = "java is easy";
        String[] sp = s.split(" ");
        for (int i = sp.length-1; i >=0 ; i--) {
            System.out.print(sp[i]+" ");
        }
    }
}
