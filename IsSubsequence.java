public class IsSubsequence {
    public static void main(String[] args) {
        String a="aec";
        
        String b="abcde";
        System.out.println(isSubsequence(a, b));

        
    }

    public static boolean isSubsequence(String s, String t) {
        
        if(s.length() == 0){
            return true;
        }
        if(t.length() == 0){
            return false;
        }
        int i=0;
        for(int j=0;j<t.length();j++){
            if(t.charAt(j) == s.charAt(i)){
                i++;
            }
        }
        if(i == s.length()){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}