public class HIndexII {
 public static void main(String[] args) {
     int[] a= {0,1,3,5,6};
     hIndex(a);
     
 }   
 public static int hIndex(int[] citations) {
     int ans=0;
     int l=citations.length;
     if(citations.length==0){return 0;}
     if(citations.length==1){return citations[0];}
     for(int i=0;i<l;i++){     
         if(citations[i] == l-i){
             ans=citations[i];
             break;
         }
     }
     System.out.println(ans);

     return ans;
        
}
}