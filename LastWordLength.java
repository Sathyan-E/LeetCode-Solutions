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