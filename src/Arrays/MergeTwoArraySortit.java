package Arrays;

import java.util.Arrays;

public class MergeTwoArraySortit {
    public static void main(String[] args) {
        int[] a = {4,7,1,3};
        int[] b = {7,9,3,6};
        int[] c = new int[a.length+b.length];
        int i=0;
        while (i<a.length){
            int j = i-1;
            while(j>=0 && c[j]>a[i]){
                c[j+1]=c[j];
                j--;
            }
            c[j+1]=a[i];
            i++;
        }
        System.out.println(Arrays.toString(c));
        int k=0;
        while(k<b.length){
            int j = i-1;
            while (j>=0 && c[j]>b[k]){
                c[j+1]=c[j];
                j--;
            }
            c[j+1]=b[k];
            k++;
            i++;
        }
        System.out.println(Arrays.toString(c));
    }
}
