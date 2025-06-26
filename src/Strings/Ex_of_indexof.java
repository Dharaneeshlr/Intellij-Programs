package Strings;

public class Ex_of_indexof {
    public static void main(String[] args) {
        String st = "javadeveloper";
        System.out.println("Place of index : "+st.indexOf('a'));
        System.out.println("The place where it start index of the string :"+st.indexOf("per"));
        System.out.println("If there is no word present int string the indeof will return -1 : "+st.indexOf('S') );
        System.out.println("Find the second letter where it is presrent : "+st.indexOf("a",2));
        //lastIndexof
        System.out.println("Finding the last letter where it is present : "+st.lastIndexOf('e'));
        System.out.println("---------------------------");

        //contains ==> boolean values as the result returns true or false
        System.out.println("Wheather the letter is present or not : "+st.contains("a"));
        System.out.println("Wheather the letter is present or not : "+st.contains("develop"));
        System.out.println("---------------------------");
        System.out.println("Wheather the letter is present or not : "+st.contains("A"));

    }
}
