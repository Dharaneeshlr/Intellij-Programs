package Strings.replace;

public class ReplaceAll {
    public static void main(String[] args) {
        String  str = "Java Is Easy";
        String st = "we can use replace() and repalce() chaining ";
        System.out.println(str.replace("a","$"));
        System.out.println("-------------------------------");
        System.out.println(st.replace("e","*").replace("a","||"));
        System.out.println("-------------------------------");
        System.out.println(str.replaceAll("[a-z]","%"));
    }
}
