/**
Problem No:53
Problem Definition:
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:
Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

**/
public class MaximumSubArray {
    public static void main(String[] args) {
        int[] a ={-2,-1};
        maxSubArray(a);
        
    }
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        else if (nums.length==1){
            return 1;
        }
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                int a=nums[j];
                sum+=a;
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
        return maxSum;
        
    }

    
}
