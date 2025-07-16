package Arrays.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {6,8,2,4,6,1,3,7,5};
        System.out.println(search(a,4));
        System.out.println(search(a,10));
    }
    public static int search(int[] a,int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key) return i;
        }
        return -1;
    }
}
