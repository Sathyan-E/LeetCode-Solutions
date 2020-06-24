public class ReverseInteger {
    public static void main(String[] args) {

        //System.out.println(Integer.valueOf("00023"));
        //System.out.println(Math.pow(2, 31));
        int x =reverse(-2147483648);
       // 2,147,483,647
        System.out.println(x);
    }

    public static int reverse(int x) {
        long number=x;
        long answer=0;
        long balance=0;
        
        if(number>-10 && number<10){
            return x;
        }
        else if(number>=10){
            while(number>0){
                balance=number %10;
                number=number/10;
                answer=answer*10;
                answer+=balance;
                if(answer > 2147483647){
                    answer=0;
                    break;
                }
            }
        }
        else if(number<=-10){
            number*=-1;
            while(number>0){
                balance=number %10;
                number=number/10;
                answer=answer*10;
                answer+=balance;
            
                if(answer*-1 < -2147483648){
                    answer=0;
                    break;
                }
            }
            answer*=1;
            
            System.out.println(answer);
            
        }
        return (int)answer;
        //Integer.valueOf();
        
    }
    
}