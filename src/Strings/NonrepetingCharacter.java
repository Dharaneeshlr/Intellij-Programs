package Strings;

public class NonrepetingCharacter {
    public static void main(String[] args) {
        String str = "ascdrradgre";
        char[] ch = str.toCharArray();
        String temp = "";
        for (int i = 0; i < ch.length; i++) {
            boolean flag = false;
            if (ch[i] == '\u0000') continue;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    ch[j] = '\u0000';
                    flag = true;
                }
            }
            if (flag) {
                ch[i] = '\u0000';
            } else {
                temp += ch[i];
            }
        }
        System.out.println(temp);
    }
}

