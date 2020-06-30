public class PowerOf2 {
    public static void main(String[] args) {
        int a=8;
        System.out.println(isPowerOfTwo(0));
        
    }
    public static boolean isPowerOfTwo(int n) {
        boolean result=false;
        if(n==1){
            return true;
        }
        while (n>1){
            
            int bal=n%2;
            if(bal!=0){
                break;
            }
            n=n/2;
            if(n==1){
                result=true;
            }
        }
        return result;
        
    }
    
}