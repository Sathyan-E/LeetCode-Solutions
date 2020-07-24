/**
Problem No:58
Problem Description:
Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word (last word means the last appearing word if we loop from left to right) in the string.

If the last word does not exist, return 0.

Note: A word is defined as a maximal substring consisting of non-space characters only.

Example:

Input: "Hello World"
Output: 5

**/
public class LastWordLength {
    public static void main(String[] args) {
        String a="  a ";
        int x=lengthOfLastWord(a);
        System.out.println(x);
        
    }
    public  static int lengthOfLastWord(String s) { 
        int length=s.length();
        if(length == 0){
            return 0;
        }
        int i=length-1;
        //int index=i;
        while(s.charAt(i) == ' '){
            i--;
            if(i<0){
                return 0;
            }
        }
        int len=0;
        while(s.charAt(i)!=' '){
           len++;
            i--;
            if(i<0){
                return len;
            }
        }    
        return len;       
    }
    
}
