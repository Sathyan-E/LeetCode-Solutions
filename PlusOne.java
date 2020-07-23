/***
Problem No:66
Problem Description:

Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

**/
import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4,3,2,1,0};
        int[] b ={4,3,2,1};
        plusOne(a);

        
    }

    public static int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<Integer>();
        int i=digits.length-1;
        int carry=1;
        while(i>=0){
            int x =digits[i];
            if(x==9 && carry==1){
                x=0;
                carry=1;
            }
            
            else if(x>=0 && x<9){
                x=x+carry;
                carry=0;
            }
            
            
            list.add(0,x);
            i--;
            if(i<0 && carry==1){
                list.add(0, carry);
                break;
            }
        }
        System.out.println(list);
        int[] answer=new int[list.size()];
        int j=0;
        while(j<list.size()){
            answer[j]=list.get(j);
            j++;
        }
        
        return answer;

        
    }
    
}
