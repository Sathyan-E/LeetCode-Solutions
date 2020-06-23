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