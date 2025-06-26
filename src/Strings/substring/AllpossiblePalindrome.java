package Strings.substring;

public class AllpossiblePalindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 3; j < str.length(); j++) {
                String st = str.substring(i, j);
              //  System.out.println(st);
                if(isPalindome(st))
                    System.out.println(st);
            }
        }
    }

    public static boolean isPalindome(String st) {
        int i = 0;
        int j = st.length() - 1;
        while (i < j) {
            if(st.charAt(i)!=st.charAt(j))return false;
            i++;
            j--;
        }
        return true;
    }
}
