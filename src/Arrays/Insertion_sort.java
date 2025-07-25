package Arrays;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] a = {6,8,2,7,5};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] a){
        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while (j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
    }
}
