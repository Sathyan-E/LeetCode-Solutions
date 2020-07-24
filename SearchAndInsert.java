/**
Problem No:35
Problem Description:
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2

Example 2:

Input: [1,3,5,6], 2
Output: 1

Example 3:

Input: [1,3,5,6], 7
Output: 4

Example 4:

Input: [1,3,5,6], 0
Output: 0


**/


public class SearchAndInsert {
    public static void main(String[] args) {
        int[] arr={1,2,5,7,9,11,13};
        int target=10;
        System.out.println(searchInsert(arr, target));
        
    }
    public static int searchInsert(int[] nums, int target) {
        int l=nums.length;
        int index=0;
        if(l==0){
            return 0;
        }
        else{
            if(target<nums[0]){
                return 0;
            }
            else if(target > nums[l-1]){
                return l;
            }
            for(int i=0;i<l;i++){
                if(target<nums[i]){
                    index=i;
                    break;
                }
                else if(target == nums[i])
                {
                    return i;
                }
            }
            return index;
        }
        
    }
    
}
