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