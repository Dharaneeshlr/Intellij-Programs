package Strings;

public class ReversetheLetters {
    public static void main(String[] args) {
        String str = "Java Is Easy";
        System.out.println(rev(str));
    }
    public static String rev(String str){
      int i=0;
      int j=0;
      String s2="";
      while (j<str.length()){
          while (j<str.length() && str.charAt(i)!=' '){
              j++;
          }
          int k=j-1;
          String temp="";
          while(k>=i){
              temp+=str.charAt(k);
              k--;
          }
          s2+=temp;
          if(j<str.length()) s2+=" ";
          j++;
          i=j;
      }
        return s2;
    }
}

