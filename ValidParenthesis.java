/**
Problem No:20
Problem Description:
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true

Example 2:

Input: "()[]{}"
Output: true

Example 3:

Input: "(]"
Output: false

Example 4:

Input: "([)]"
Output: false

Example 5:

Input: "{[]}"
Output: true


**/
import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
    public static void main(String[] args) {
        String a="([{";
        
        System.out.println(isValid(a));
        
    }

    public static boolean isValid(String s) {
        
        if(s.length() == 0){return true;}
        if(s.charAt(0) == ']' || s.charAt(0) == ')'|| s.charAt(0) == '}' ){
            return false;
        }
        int i=0;
        List<Character> list = new ArrayList<>();
        while(i<s.length()){
            list.add(s.charAt(i));
            i++;
        }
        //System.out.println(list);
        int j=1;
        while(j<list.size()){
            char z =list.get(j);
            if(z == '}'){
                if(list.get(j-1) == '{'){
                    list.remove(j);
                    list.remove(j-1);
                    if(j==1){
                        j=0;
                    }
                    else{
                        j-=3;
                    }
                }
                else{
                    return false;
                }

            }
            else if(z == ')'){
                if(list.get(j-1) == '('){
                    list.remove(j);
                    list.remove(j-1);
                    if(j<=1){
                        j=0;
                    }
                    else{
                        j-=3;
                    }
                }
                else{
                    return false;
                }

            }
            else if(z == ']'){
                if(list.get(j-1) == '['){
                    list.remove(j);
                    list.remove(j-1);
                    if(j<=1){
                        j=0;
                    }
                    else{
                        j-=3;
                    }
                }
                else{
                    return false;
                }

            }

            if(list.size() == 0){
                return true;
            }
            
            
            //System.out.println(z);
            j++;
        }

        return false;
        
    }
    
}
