/**
Problem No:14
Problem Description:
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Note:

All given inputs are in lowercase letters a-z.

**/
public class LongestCommonPrefix {
    public static void main(String[] args) {
        //System.out.println("Sathyan");
        String[] a={"flower","flow","flight"};
        String[] b= {"aa","a"};
        System.out.println(longestCommonPrefix(b));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        if(strs.length == 1){
            return strs[0];
        }
        String first=strs[0];
        String answer="";
        //int i=1;
        for(int i=1;i<strs.length;i++){
            String word=strs[i];
            //System.out.println(word);
            int j=0;
            while(j<first.length() && j<word.length()){
                if(first.charAt(j) == word.charAt(j)){
                    answer+=first.charAt(j);
                }
                else{
                    first=answer;
                    break;
                }
                j++;
                if(j>=first.length() || j>=word.length()){
                    first=answer;
                    break;
                }
                
            }
            //System.out.println(answer);
            //System.out.println(first);
            answer="";
               
        }
       // System.out.println(first);
        if(first.length()==0){
            return "";
        }
        return first;   
    }
    
    
}
