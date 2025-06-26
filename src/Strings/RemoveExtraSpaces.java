package Strings;

public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String str = "   java  is    easy  ";
        str = str.trim();
        String res = "";
        char[] ch =str.toCharArray();
        for(int i = 0;i<ch.length;i++){
            if(ch[i]!=' '||ch[i+1]!=' '){
                res+=ch[i];
            }
        }
        System.out.println(res);
    }
}

                //or else we can use this .trim() method

//if (ch[i] != ' ' || (i + 1 < ch.length && ch[i+1] != ' ')) {
//        // Also: skip adding a space at the start
//        if (!(res.isEmpty() && ch[i] == ' ')) {
//res += ch[i];
//        }
//        }
