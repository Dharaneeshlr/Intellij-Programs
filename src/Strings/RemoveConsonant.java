package Strings;

public class RemoveConsonant {
    public static void main(String[] args) {
        String str = "Amaran";
        String res = "";
        int count =0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z') ) {
                if(!(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')){
                    count++;
                }
            }
        }
        for (int i = 0; i < ch.length; i++) {
            if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z') ) {
                if((ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')){
                    res+=ch[i];
                }else {
                    if(count>=3){
                        res+='_';
                    }else{
                        res+=ch[i];
                    }
                }
            }else{
                res+=ch[i];
            }
        }
        System.out.println(res);
    }
}


//BY using StringBuilder....> append and indexof

//package Strings;
//
//public class RemoveConsonantOptimized {
//    public static void main(String[] args) {
//        String str = "Amaran";
//        char[] ch = str.toCharArray();
//        int consonantCount = 0;
//
//        // First pass: count total consonants
//        for (int i = 0; i < ch.length; i++) {
//            if (isLetter(ch[i]) && !isVowel(ch[i])) {
//                consonantCount++;
//            }
//        }
//
//        // Second pass: build result efficiently
//        StringBuilder res = new StringBuilder();
//
//        for (int i = 0; i < ch.length; i++) {
//            if (isLetter(ch[i])) {
//                if (isVowel(ch[i])) {
//                    res.append(ch[i]); // keep vowel
//                } else {
//                    if (consonantCount >= 3) {
//                        res.append('_'); // replace consonant if >= 3
//                    } else {
//                        res.append(ch[i]); // keep consonant if < 3
//                    }
//                }
//            } else {
//                res.append(ch[i]); // non-letters: keep as is
//            }
//        }
//
//        System.out.println(res);
//    }
//
//    // Helper: check if letter
//    static boolean isLetter(char c) {
//        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
//    }
//
//    // Helper: check if vowel
//    static boolean isVowel(char c) {
//        return "AEIOUaeiou".indexOf(c) != -1;
//    }
//}

