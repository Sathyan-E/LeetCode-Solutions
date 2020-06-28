public class Sqrt {
    public static void main(String[] args) {
        int a=80;
        System.out.println(mySqrt(a));
        
    }

    public  static int mySqrt(int x) {
        int ans=(int) Math.pow(x,0.5);
       // System.out.println(ans);
        return ans;
        
    }
    
}