import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a={1,2,3,0,0,0};
        int[] b={2,5,6};
        int m=3;
        int n=3;
        merge(a,m,b,n);
        //List list = Arrays.asList(a);
        //System.out.println(list.get(0));
        
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        while(i<n){
            nums1[m+i]=nums2[i];    
            i++;
        }
        System.out.println(nums1[nums1.length-3]);
        Arrays.sort(nums1);
        System.out.println(nums1[nums1.length-3]);
        
    }
    
}