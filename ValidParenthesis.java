import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
    public static void main(String[] args) {
        String a="([{";
        
        System.out.println(isValid(a));
        
    }

    public static boolean isValid(String s) {
        
        if(s.length() == 0){return true;}
        if(s.charAt(0) == ']' || s.charAt(0) == ')'|| s.charAt(0) == '}' ){
            return false;
        }
        int i=0;
        List<Character> list = new ArrayList<>();
        while(i<s.length()){
            list.add(s.charAt(i));
            i++;
        }
        //System.out.println(list);
        int j=1;
        while(j<list.size()){
            char z =list.get(j);
            if(z == '}'){
                if(list.get(j-1) == '{'){
                    list.remove(j);
                    list.remove(j-1);
                    if(j==1){
                        j=0;
                    }
                    else{
                        j-=3;
                    }
                }
                else{
                    return false;
                }

            }
            else if(z == ')'){
                if(list.get(j-1) == '('){
                    list.remove(j);
                    list.remove(j-1);
                    if(j<=1){
                        j=0;
                    }
                    else{
                        j-=3;
                    }
                }
                else{
                    return false;
                }

            }
            else if(z == ']'){
                if(list.get(j-1) == '['){
                    list.remove(j);
                    list.remove(j-1);
                    if(j<=1){
                        j=0;
                    }
                    else{
                        j-=3;
                    }
                }
                else{
                    return false;
                }

            }

            if(list.size() == 0){
                return true;
            }
            
            
            //System.out.println(z);
            j++;
        }

        return false;
        
    }
    
}