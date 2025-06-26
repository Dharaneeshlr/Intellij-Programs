package Strings.Splitmethod;

public class Split {
    public static void main(String[] args) {
        String s = "java@is@easy";
        String[] sp = s.split("@");

        System.out.println(s.length()+"\n");
        System.out.println(sp.length);
        for(String s2 : sp){
            System.out.println(s2);
        }
    }
}
