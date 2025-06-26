package Strings.substring;

public class Spreadthewords {
    public static void main(String[] args) {
        String str = "aabbccadd";
        String st = "";
        int count =1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                st += str.charAt(i)+String.valueOf(count);
                /*     String.valueOf(count) it is used to make the integer count into String
                       because String.valueOf(count) changes the number to "2".
                       Then "a" + "2" becomes "a2".
                 */
                count=1;
            }
        }
        st +=str.charAt(str.length()-1)+String.valueOf(count);
        System.out.println(st);
    }
}

// st +=str.charAt(str.length()-1)+String.valueOf(count);
/*
For aabbccdd:
Loop does:
a → count 2 → add a2
b → count 2 → add b2
c → count 2 → add c2
But then d is left unprocessed!
So result is a2b2c2
===>Missing d2


It handles the final character sequence:
The last character (in aabbccdd, it’s d)
And the final count (2)
 */