/**
 * Problem Date:04 aug 2020
 * Problem Definition:
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example 1:
Input: 16
Output: true

Example 2:
Input: 5
Output: false

Runtime: 1 ms
Language:Java
 */


public class PowerOfFour {
    public static void main(String[] args) {
        int a=256;
        System.out.println(isPowerOfFour(a));
        
    }

    public static boolean isPowerOfFour(int num) {
        if(num==1){
            return true;
        }
        else if(num<=0 || (num>1 && num<4)){
            return false;
        }
        int bal=0;
        while(bal==0 && num>=4){
            bal=num%4;
            num=num/4;
            
            if(bal==0 && num==1){
                return true;
            }
        }    
        return false;
    }
    
}