/**
 * Problem Definition:
 * Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true

Example 2:

Input: [1,2,3,4]
Output: false

Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true


 */

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDublicate {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(containsDuplicate(a));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(set.contains(a)){
                return true;
            }
            set.add(a);
        }
        return false;
    }
    
}