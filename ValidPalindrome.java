/**
 * Problem NO: 3rd aug
 * Problem Description:
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:
Input: "A man, a plan, a canal: Panama"
Output: true

Example 2:
Input: "race a car"
Output: false

Constraints:

    s consists only of printable ASCII characters.

 */

import java.util.ArrayList;

public class ValidPalindrome {
    public static void main(String[] args) {

        String word="A man, a plan, a canal: Panama";
        boolean ans=isPalindrome(word);
        System.out.println(ans);
    }
    public static boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        String lowerString= s.toLowerCase();
        ArrayList<Character> list= new ArrayList<>();
        ArrayList<Character> list2 =  new ArrayList<>();
        
        for(int k=0;k<lowerString.length();k++){
            if((lowerString.charAt(k)>= 'A' && lowerString.charAt(k)<= 'Z')||
            (lowerString.charAt(k)>= 'a' && lowerString.charAt(k)<= 'z' )||
            (lowerString.charAt(k)<='9' &&lowerString.charAt(k)>='0'))
            {
                list.add(lowerString.charAt(k));
            }
        }
        int pos=list.size();
        for(int i=pos-1;i>=0;i--){
            list2.add(list.get(i));
        }
        for(int j=0;j<pos;j++){
            if(list.get(j) != list2.get(j)){
                return false;
            }
        }
        return true;
        
    }
    
}