package Arrays;

import java.util.Arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] a = {3,4,6,8,9};
        int[] b = {1,2,4,6,8};

        int[] c= new int[a.length+b.length];
        int i=0,j=0,k=0;
        // Merge elements using two pointers
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k++]=a[i++];
            }else {
                c[k++]=b[j++];
            }
        }
        // Copy remaining elements of a
        while (i<a.length){
            c[k++]=a[i++];
//            k++;
//            i++;
        }
        // Copy remaining elements of b
        while(j<b.length){
            c[k++]=b[j++];
        }
        System.out.println(Arrays.toString(c));
    }
}
