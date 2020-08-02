/**
Problem No:28
Problem Definition:
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2

Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.
**/
public class Strstr {
    public static void main(String[] args) {
        String a ="Hello World";
        String b="ll";
        strStr(a,b);
    }
    
    public static int strStr(String haystack, String needle) {
        int x = haystack.indexOf(needle);
        System.out.println(x);
        return x;
        
    }
}
