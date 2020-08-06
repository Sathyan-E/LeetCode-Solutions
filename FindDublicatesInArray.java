/**
 * Problem no: 6 Aug 2020
 * Problem Description:
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]

 */

import java.util.List;
import java.util.HashSet;
import java.util.ArrayList;

public class FindDublicatesInArray {
    public static void main(String[] args) {
        int[] a={4,3,2,7,8,2,3,1,8};
        List<Integer> s= findDuplicates(a);
    }
    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> mySet  = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            if(mySet.contains(c)){
                list.add(c);
            }
            else{
                mySet.add(c);
            }
        }
        System.out.println(list);
        return list;
    }
    
}