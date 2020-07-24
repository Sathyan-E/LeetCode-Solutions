/**
Problem No:01
Problem Description:
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


**/
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class TwoSum{
     public static void main(String[] args) {
        //initalize an arrray and a target value.
        
    }
    public int[] twoSum(int[] nums, int target) {
        int[] indexArray = new int[2];
        int l = nums.length; 
        Map<Integer,Integer> myHashMap = new HashMap<>();
        
        for(int i=0;i<l;i++){
            myHashMap.put(nums[i],i);
        }
        
        for (int j=0;j<l;j++){
            int numberTwo = target - nums[j];
            
            if (myHashMap.containsKey(numberTwo) && myHashMap.get(numberTwo) !=j){
                if (myHashMap.get(numberTwo) < j){
                    indexArray[0] = myHashMap.get(numberTwo);
                    indexArray[1] = j;
                    break;
                }
                else{
                    indexArray[0] = j;
                    indexArray[1] = myHashMap.get(numberTwo);
                    break;
                    
                }
            }
        }
        
        return indexArray;
            
               
    }
    
}
