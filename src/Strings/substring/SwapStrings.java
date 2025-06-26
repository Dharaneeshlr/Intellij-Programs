package Strings.substring;

public class SwapStrings {
    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "horse";

        System.out.println("Before Swap:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        // Step 1: Concatenate both strings and assign to s1
        s1 = s1 + s2;  // s1 = "racehorse"

        // Step 2: Extract original s1 from s1 and assign to s2
        s2 = s1.substring(0, s1.length() - s2.length());  // s2 = "race"

        // Step 3: Extract original s2 from s1 and assign to s1
        s1 = s1.substring(s2.length());  // s1 = "horse"

        System.out.println("After Swap:");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}

