public class ReverseString {
    public static void main(String[] args) {
        String word = "Hannah";
        char[] s=word.toCharArray();
        //char[] sout ={"o","l","l","e","h"};
        arrayPrint(s);
        reverseString(s);
        arrayPrint(s);

        
        
    }

    public static void reverseString(char[] s) {
        int front=0;
        int l=s.length;
        for (int i=l-1;i>=l/2;i--){
            char temp=s[i];
            s[i]=s[front];
            s[front]=temp;
            front++;
        }
        
    }

    public static void arrayPrint(char[] s){
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
    
}