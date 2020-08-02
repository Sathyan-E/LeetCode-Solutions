/**
Problem Date:01.08.2020
Problem Definition:

 * Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

    All letters in this word are capitals, like "USA".
    All letters in this word are not capitals, like "leetcode".
    Only the first letter in this word is capital, like "Google".

Otherwise, we define that this word doesn't use capitals in a right way.

Example 1:

Input: "USA"
Output: True

Example 2:

Input: "FlaG"
Output: False

Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.

 */

public class DetectCapital{
    public static void main(String[] args) {
        String a="satyan";
       System.out.println(detectCapitalUse(a));
        
    }

    public static boolean detectCapitalUse(String word) {
        if(word.length()==1){
            return true;
        }
        boolean ans=false;
        char a=word.charAt(0);
        char b=word.charAt(1);
        if(Character.isUpperCase(a)==true && Character.isUpperCase(b)==true ){
            System.out.println("1");
            ans=fullCaptal(word,2);
        }
        else if(Character.isUpperCase(a)==true && Character.isUpperCase(b)!=true){
            System.out.println("2");
            ans=fullsmall(word, 1);
        }
        else{
            System.out.println("3");
            ans=fullsmall(word, 0);
        }
        
        return ans;
        
    }

    public static boolean fullCaptal(String word,int position){
        for(int i=position;i<word.length();i++){
            if(!Character.isUpperCase(word.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static boolean fullsmall(String wrd,int position){
        for(int i=position;i<wrd.length();i++){
            if(Character.isUpperCase(wrd.charAt(i))){
                return false;
            }
        }
        
        return true;
    }


}
