public class AddBinary {
    public static void main(String[] args) {
        String c="101111";
        String d="10";
       System.out.println(addBinary(c,d));
        


        
    }
    public static String addBinary(String a, String b) {
        if(a.equals("0")){
            return b;
        }else if(b.equals("0")){
            return a;
        }
        char num1='0';
        char num2='0';
        String ans=""; 
        int m=a.length();
        int n=b.length();
        int i=m-1;
        int j=n-1;
        int career=0;
        while(i>=0 || j>=0){
            if(i<0 && career==1){
                num1='1';
                num2=b.charAt(j);
                career=0;
            }else if(i<0 && career==0){
                String sub=b.substring(0, j+1);
                ans=sub+ans;

                return ans;
            }
            else if(j<0 && career == 1){
                num1=a.charAt(i);
                num2='1';
                career=0;
            }
            else if(j<0 && career==0){
                String sub=a.substring(0,i+1);
                ans=sub+ans;
                return ans;
            }
            else{
                 num1=a.charAt(i);
                 num2=b.charAt(j);

            }
            
            if(num1=='0' && num2=='0'){
                if(career==0){
                    ans=0+ans;
                }
                else{
                    ans=1+ans;
                }
                career=0;

            }
            else if(num1=='1' && num2=='1'){
                if(career==1){
                    ans=1+ans;
                }
                else{
                    ans=0+ans;
                }
                career=1;

            }else{
                if(career==1){
                    ans=0+ans;
                    career=1;
                }else{
                    ans=1+ans;
                }

            }
            i--;
            j--;
        }
        if(career == 1){
            ans=1+ans;
        }
        //System.out.println(ans);
        return ans;     
    }
    
}