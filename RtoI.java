import java.util.HashMap;
import java.util.Map;

public class RtoI {
    public static void main(String[] args) {
        String number = "LVIII";
        //MCMXCIV
        int l=number.length();
        int i=0;
        int answer=0;
        String test ="";
    

        while(i<l){
            
            char x=number.charAt(i);
            test=String.valueOf(x);
            if(i+1 <= l-1){
                char y=number.charAt(i+1);           
                if (x == 'I' && (y== 'V' || y == 'X')){
                    test += String.valueOf(y);
                    System.out.println(test);
                    i++;                                    
                }
                else if(x == 'X' && (y == 'L' || y == 'C')){
                    test+= String.valueOf(y);
                    System.out.println(test);
                    i++;
                }
                else if(x == 'C' && (y =='D'|| y == 'M')){
                    test+= String.valueOf(y);
                    System.out.println(test);
                    i++;
                }
                
            }    
            //System.out.println("The test value is "+test);
            answer+=romanToInt(test);
            i++;
            //System.out.println("The number is :"+answer);

        }
        System.out.println(answer);

    }

    public static int romanToInt(String s) {
        int x=0;
        switch(s){
            case "IV":
                x=4;
                break;
            case "IX":
                x=9;
                break;
            case "XL":
                x=40;
                break;
            case "XC":
                x=90;
                break;
            case "CD":
                x=400;
                break;
            case "CM":
                x=900;
                break;
            case "M":
                x=1000;
                break;

            case "I":
                x=1;
                break;
            case "V":
                x=5;
                break;
            case "X":
                x=10;
                break;
            case "L":
                x=50;
                break;
            case "C":
                x=100;
                break;
            case "D":
                x=500;
                break;
            
            
        }

        //System.out.println(x);
        return x;
        
    }

    
    
}