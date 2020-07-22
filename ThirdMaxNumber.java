/**
 * Given a non-empty array of integers, return the third maximum number in this array. If it does not exist, return the maximum number. The time complexity must be in O(n).

Example 1:

Input: [3, 2, 1]

Output: 1

Explanation: The third maximum is 1.

Example 2:

Input: [1, 2]

Output: 2

Explanation: The third maximum does not exist, so the maximum (2) is returned instead.

Example 3:

Input: [2, 2, 3, 1]

Output: 1

Explanation: Note that the third maximum here means the third maximum distinct number.
Both numbers with value 2 are both considered as second maximum.

 */


import java.util.Arrays;
import java.util.Collections;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] a={2,2,3,1};
        System.out.println(thirdMax(a));
    }
    public static int thirdMax(int[] nums) {
        if(nums.length==1){
            return nums[0]; 
        }
        int count=1;
        int ans=nums[0];
       int[] decendingArray=new int[nums.length];
       Arrays.sort(nums);
       int j=0;
       for(int i=nums.length-1;i>=0;i--){
            decendingArray[j]=nums[i];
            j++;
       }

       if(decendingArray.length<3){
           return decendingArray[0];
       }
       int previous=decendingArray[0];

       for(int index=1;index<decendingArray.length;index++){
           if(previous!=decendingArray[index]){
            count++;
            previous=decendingArray[index];
           }
           if(count==3){
               ans=decendingArray[index];
               break;
           }
           if(index==decendingArray.length-1 && count!=3){
               ans=decendingArray[0];
               break;
           }
            

       }

    /**
     * for(int k=0;k<decendingArray.length;k++){
           System.out.println(decendingArray[k]);
       }
     */
       
       return ans;
    }
    
}