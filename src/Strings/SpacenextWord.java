package Strings;

public class SpacenextWord {
    public static void main(String[] args) {
        String str = "java is easy";
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==' '){
                System.out.println();
            }else{
                System.out.print(ch[i]);
            }
        }
    }
}
