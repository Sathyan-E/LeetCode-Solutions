/**
PRoblem NO:9
Problem Description:
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

**/

public class Palindrome {
    public static void main(String[] args) {
        int x=0;
        boolean check = isPalindrome(x);
        System.out.println(check);

        
    }
    public static boolean isPalindrome(int x) {
        if( x >=0 && x <10){
            return true;
        }
        if(x<0){
            return false;    
        }
        int answer=0;
        int number=x;
        System.out.println(x);
        while(x>0){
            int balance = x % 10;
            x=x/10;
            answer = answer *10;
            answer+= balance;
        
        }
        System.out.println("The reversed:"+answer);
        if (number == answer){
            return true;
        }
        else{
            return false;
        }
        

        
    }
    
}
